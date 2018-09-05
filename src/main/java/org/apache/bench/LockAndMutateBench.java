package org.apache.bench;

import java.util.List;

public class LockAndMutateBench extends AbstractBenchmark {
  public static final String NAME = "lockMutate";

  private LockAndMutateBench(final CmdArgs config) {
    super(config);
  }

  @Override
  public SuccessResult aggregateMetrics(List<SuccessResult> metrics) {
    return null;
  }

  @Override
  public Task createTask(CmdArgs cmdArgs) {
    return null;
  }

  public static class Factory implements Benchmark.Factory<LockAndMutateBench> {
    @Override
    public LockAndMutateBench create(final CmdArgs config) {
      return new LockAndMutateBench(config);
    }
  }
}
