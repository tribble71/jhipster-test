package ch.misha.jhipster.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class JobHistoryAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertJobHistoryAllPropertiesEquals(JobHistory expected, JobHistory actual) {
        assertJobHistoryAutoGeneratedPropertiesEquals(expected, actual);
        assertJobHistoryAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertJobHistoryAllUpdatablePropertiesEquals(JobHistory expected, JobHistory actual) {
        assertJobHistoryUpdatableFieldsEquals(expected, actual);
        assertJobHistoryUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertJobHistoryAutoGeneratedPropertiesEquals(JobHistory expected, JobHistory actual) {
        assertThat(expected)
            .as("Verify JobHistory auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertJobHistoryUpdatableFieldsEquals(JobHistory expected, JobHistory actual) {
        assertThat(expected)
            .as("Verify JobHistory relevant properties")
            .satisfies(e -> assertThat(e.getStartDate()).as("check startDate").isEqualTo(actual.getStartDate()))
            .satisfies(e -> assertThat(e.getEndDate()).as("check endDate").isEqualTo(actual.getEndDate()))
            .satisfies(e -> assertThat(e.getLanguage()).as("check language").isEqualTo(actual.getLanguage()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertJobHistoryUpdatableRelationshipsEquals(JobHistory expected, JobHistory actual) {
        assertThat(expected)
            .as("Verify JobHistory relationships")
            .satisfies(e -> assertThat(e.getJob()).as("check job").isEqualTo(actual.getJob()))
            .satisfies(e -> assertThat(e.getDepartment()).as("check department").isEqualTo(actual.getDepartment()))
            .satisfies(e -> assertThat(e.getEmployee()).as("check employee").isEqualTo(actual.getEmployee()));
    }
}
