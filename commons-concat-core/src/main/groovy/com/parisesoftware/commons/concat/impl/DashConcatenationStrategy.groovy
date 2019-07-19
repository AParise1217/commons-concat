package com.parisesoftware.commons.concat.impl

import com.parisesoftware.commons.concat.IConcatenationStrategy

/**
 * {@inheritDoc}
 * <p>
 * {@link IConcatenationStrategy} implementation for delimiting by a Dash
 *
 * @version 1.0
 * @since 1.0
 */
class DashConcatenationStrategy implements IConcatenationStrategy {

    /**
     * {@inheritDoc}
     * @version 1.0
     * @since 1.0
     */
    @Override
    String concatenate(String aFirstValue, String aSecondValue) {
        return "${aFirstValue}-${aSecondValue}"
    }

}
