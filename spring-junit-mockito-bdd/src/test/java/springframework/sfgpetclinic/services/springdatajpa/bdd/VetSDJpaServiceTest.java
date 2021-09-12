package springframework.sfgpetclinic.services.springdatajpa.bdd;

import springframework.sfgpetclinic.repositories.VetRepository;
import springframework.sfgpetclinic.services.springdatajpa.VetSDJpaService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class VetSDJpaServiceTest {

    @Mock
    VetRepository vetRepository;

    @InjectMocks
    VetSDJpaService service;

    @Test
    void deleteById() {
        service.deleteById(1L);

        verify(vetRepository).deleteById(1L);
    }
}