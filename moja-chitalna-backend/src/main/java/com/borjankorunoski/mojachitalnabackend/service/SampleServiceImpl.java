package com.borjankorunoski.mojachitalnabackend.service;

import com.borjankorunoski.mojachitalnabackend.model.Sample;
import com.borjankorunoski.mojachitalnabackend.repository.SampleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SampleServiceImpl implements SampleService{
  private final SampleRepository sampleRepository;

  @Override
  public Sample addSample(Sample sample) {
    return sampleRepository.save(sample);
  }

  @Override
  public List<Sample> getAllSamples() {
    return sampleRepository.findAll();
  }

  @Override
  public Sample updateSample(long sampleId, Sample sample) {
    return null;
  }

  @Override
  public void deleteSample(long sampleId) {
    sampleRepository.deleteById(sampleId);
  }
}
