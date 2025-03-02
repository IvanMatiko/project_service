package faang.school.projectservice.mapper.project;

import faang.school.projectservice.dto.stage.ProjectDto;
import faang.school.projectservice.model.Project;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ProjectMapper {
    ProjectDto toDto(Project project);

    Project toEntity(ProjectDto projectDto);

    List<ProjectDto> toDto(List<Project> projects);

    List<Project> toEntity(List<ProjectDto> projectDtos);
}