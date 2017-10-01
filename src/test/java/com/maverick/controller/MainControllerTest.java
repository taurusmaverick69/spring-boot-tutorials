package com.maverick.controller;

import com.google.common.collect.ImmutableList;
import com.maverick.service.GroupService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MainControllerTest {

    @Mock
    private GroupService groupService;

    @InjectMocks
    private MainController controller;

    @Test
    public void findAllTest() {
        when(groupService.findAll()).thenReturn(ImmutableList.of());
        verify(groupService).findAll();
    }
}