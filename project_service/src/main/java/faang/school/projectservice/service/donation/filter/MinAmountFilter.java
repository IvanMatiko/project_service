package faang.school.projectservice.service.donation.filter;

import faang.school.projectservice.dto.donation.DonationFilterDto;
import faang.school.projectservice.model.Donation;
import org.springframework.stereotype.Component;

import java.util.stream.Stream;

@Component
public class MinAmountFilter implements DonationFilter {
    @Override
    public boolean isApplicable(DonationFilterDto filterDto) {
        return filterDto.getMinAmount() != null;
    }

    @Override
    public Stream<Donation> apply(Stream<Donation> stageStream, DonationFilterDto filterDto) {
        return stageStream.filter(donation -> donation.getAmount().compareTo(filterDto.getMinAmount()) >= 0);
    }
}