/*
package com.test.kim.service;
import com.test.kim.dto.UserDto;
import com.test.kim.mapper.UserMapper;
import com.test.kim.model.Result;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

public class FileUploadServiceTest {

    @Mock
    private UserMapper userMapper;
    private FileUploadService fileUploadService;

    @BeforeEach
    public void setup() {
        userMapper = Mockito.mock(UserMapper.class);
        fileUploadService = new FileUploadService(userMapper);
    }

    @Test
    public void testUploadFile() throws Exception {
        // Mock MultipartFile
        String csvData = "John/Doe\nAlice/Smith";
        MultipartFile mockFile = createMockMultipartFile(csvData);

        // Mock UserMapper behavior
        */
/*when(userMapper.insertUser(any(UserDto.class)))
                .thenThrow(new DuplicateKeyException("Duplicate key"))
                .thenReturn(1);*//*


        // Test the uploadFile method
        Result result = fileUploadService.uploadFile(mockFile);

        // Verify the result
        assertEquals(1, result.getSuccessCount());
        assertEquals(1, result.getFailCount());
        assertTrue(result.isDuplicateCheck());

        // You can add more assertions based on your specific requirements
    }

    private MultipartFile createMockMultipartFile(String content) throws IOException {
        byte[] contentBytes = content.getBytes(StandardCharsets.UTF_8);
        return new MockMultipartFile("file.dbfile", "file.dbfile", "text/csv", new ByteArrayInputStream(contentBytes));
    }
}
*/
