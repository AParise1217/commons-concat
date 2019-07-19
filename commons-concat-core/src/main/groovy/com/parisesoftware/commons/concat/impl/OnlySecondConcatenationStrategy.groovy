package com.parisesoftware.commons.concat.impl

import com.parisesoftware.commons.concat.IConcatenationStrategy

/**
 * {@inheritDoc}
 * <p>
 * {@link IConcatenationStrategy} implementation for discarding the first value
 *
 * @version 1.0
 * @since 1.0
 */
class OnlySecondConcatenationStrategy implements IConcatenationStrategy {

    /**
     * {@inheritDoc}
     * @version 1.0
     * @since 1.0
     */
    @Override
    String concatenate(String aFirstValue, String aSecondValue) {
        return "${aSecondValue}"
    }

}
