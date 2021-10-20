package micronaut.injection.issue;

import static org.assertj.core.api.Assertions.assertThat;

import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import jakarta.inject.Inject;

@MicronautTest
class MicronautInjectionIssueTest {

    @Inject
    EmbeddedApplication<?> application;
    @Inject
    List<MyDto> myDtoList;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
        assertThat(myDtoList).hasSize(2).map(dto -> dto.x).containsExactlyInAnyOrder(1,2);
    }
}
