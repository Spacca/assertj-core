/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2020 the original author or authors.
 */
package org.assertj.core.api.charsequence;

import org.assertj.core.api.CharSequenceAssert;
import org.assertj.core.api.CharSequenceAssertBaseTest;

import static org.mockito.Mockito.verify;


/**
 * Tests for <code>{@link CharSequenceAssert#hasSizeLessThan(int)}</code>.
 * 
 * @author Sandra Parsick
 * @author Georg Berky
 */
class CharSequenceAssert_hasSizeLessThan_Test extends CharSequenceAssertBaseTest {

  @Override
  protected CharSequenceAssert invoke_api_method() {
    return assertions.hasSizeLessThan(7);
  }

  @Override
  protected void verify_internal_effects() {
    verify(strings).assertHasSizeLessThan(getInfo(assertions), getActual(assertions), 7);
  }
}
