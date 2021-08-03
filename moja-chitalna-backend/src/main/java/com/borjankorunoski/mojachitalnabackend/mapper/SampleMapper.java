package com.borjankorunoski.mojachitalnabackend.mapper;

import com.borjankorunoski.mojachitalnabackend.model.Sample;
import com.borjankorunoski.mojachitalnabackend.model.SampleItem;
import com.borjankorunoski.mojachitalnabackend.model.Samples;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SampleMapper {
  Sample getSample(SampleItem sampleItem);
  SampleItem getSampleItem(Sample sample);
  List<SampleItem> getSampleItemList(List<Sample> sampleList);
}
