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
package com.facebook.buck.rules.keys;

import com.facebook.buck.rules.SourcePath;
import com.facebook.buck.rules.SourcePathResolver;
import com.google.common.base.Supplier;
import com.google.common.collect.ImmutableSortedSet;

/**
 * Supplies dependencies that are archives. For normal rule-key generation, each archive is treated
 * as a single {@link SourcePath}. For input-based rule-key generation, each archive is treated
 * as a set of {@link SourcePath}s, one for each member of the archive.
 */
public interface ArchiveDependencySupplier extends Supplier<ImmutableSortedSet<SourcePath>> {
  @Override
  ImmutableSortedSet<SourcePath> get();

  ImmutableSortedSet<SourcePath> getArchiveMembers(SourcePathResolver resolver);
}
