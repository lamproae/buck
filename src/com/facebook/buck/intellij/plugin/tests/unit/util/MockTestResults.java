/*
 * Copyright 2016-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package unit.util;

import com.facebook.buck.intellij.plugin.ws.buckevents.parts.TestCaseSummary;
import com.facebook.buck.intellij.plugin.ws.buckevents.parts.TestResults;
import com.google.common.collect.ImmutableList;

public class MockTestResults implements TestResults {
  @Override
  public ImmutableList<TestCaseSummary> getTestCases() {
    return ImmutableList.of();
  }

  @Override
  public boolean getDependenciesPassTheirTests() {
    return false;
  }

  @Override
  public int getTotalNumberOfTests() {
    return 0;
  }

  @Override
  public boolean isSuccess() {
    return false;
  }

  @Override
  public boolean hasAssumptionViolations() {
    return false;
  }
}
