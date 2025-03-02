package faang.school.projectservice.service.project.filter;

import faang.school.projectservice.dto.project.ProjectFilterDto;
import faang.school.projectservice.model.Project;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class ProjectNameFilter implements ProjectFilter {

    @Override
    public boolean isApplicable(ProjectFilterDto filters) {
        return filters.getNamePattern() != null;
    }

    @Override
    public Stream<Project> apply(Stream<Project> projects, ProjectFilterDto filters) {
        return projects.filter(project -> project.getName().toLowerCase().trim()
                .contains(filters.getNamePattern().toLowerCase().trim()));
    }
}
