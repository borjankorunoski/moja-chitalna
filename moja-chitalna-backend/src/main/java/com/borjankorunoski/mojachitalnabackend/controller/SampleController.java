package com.borjankorunoski.mojachitalnabackend.controller;

import com.borjankorunoski.mojachitalnabackend.mapper.SampleMapper;
import com.borjankorunoski.mojachitalnabackend.model.Sample;
import com.borjankorunoski.mojachitalnabackend.model.SampleItem;
import com.borjankorunoski.mojachitalnabackend.model.Samples;
import com.borjankorunoski.mojachitalnabackend.service.SampleService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api")
@RequiredArgsConstructor
public class SampleController implements SampleApi{
  private final SampleService sampleService;
  private final SampleMapper sampleMapper;

  @Override
  public ResponseEntity<Void> addSample(SampleItem sampleItem) {
    Sample sample = sampleMapper.getSample(sampleItem);
    sampleService.addSample(sample);
    return ResponseEntity.ok().build();
  }

  @Override
  public ResponseEntity<Samples> getSamples() {
    List<Sample> sampleList = sampleService.getAllSamples();
    List<SampleItem> sampleItemList = sampleMapper.getSampleItemList(sampleList);
    Samples samples = new Samples();
    samples.setSampleItems(sampleItemList);
    return ResponseEntity.ok(samples);
  }
}
