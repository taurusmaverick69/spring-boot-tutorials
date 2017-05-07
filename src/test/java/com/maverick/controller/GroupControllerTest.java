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
public class GroupControllerTest {

    @Mock
    private GroupService groupService;

    @InjectMocks
    private GroupController controller;
    @Test
    public void findAllTest() {
        when(groupService.findAll()).thenReturn(ImmutableList.of());
        controller.findAll();
        verify(groupService).findAll();
    }
}