/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.commons.beanutils2.converters;

import java.util.Calendar;
import java.util.Date;

/**
 * Test Case for the DateConverter class.
 */
class DateConverterTest extends AbstractDateConverterTest<Date> {

    /**
     * Gets the expected type
     *
     * @return The expected type
     */
    @Override
    protected Class<Date> getExpectedType() {
        return Date.class;
    }

    /**
     * Create the Converter with no default value.
     *
     * @return A new Converter
     */
    @Override
    protected DateConverter makeConverter() {
        return new DateConverter();
    }

    /**
     * Create the Converter with a default value.
     *
     * @param defaultValue The default value
     * @return A new Converter
     */
    @Override
    protected DateConverter makeConverter(final Date defaultValue) {
        return new DateConverter(defaultValue);
    }

    /**
     * Convert from a Calendar to the appropriate Date type
     *
     * @param value The Calendar value to convert
     * @return The converted value
     */
    @Override
    protected Date toType(final Calendar value) {
        return value.getTime();
    }
}
