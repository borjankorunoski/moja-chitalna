package com.borjankorunoski.mojachitalnabackend.service;

import com.borjankorunoski.mojachitalnabackend.model.Sample;

import java.util.List;

public interface SampleService {
  Sample addSample(Sample sample);
  List<Sample> getAllSamples();
  Sample updateSample(long sampleId, Sample sample);
  void deleteSample(long sampleId);
}
