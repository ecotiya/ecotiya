package com.app.ecotiya.domain.repository;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.time.LocalDateTime;

import javax.sql.DataSource;

import org.dbunit.database.DatabaseConnection;
import org.dbunit.database.IDatabaseConnection;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.csv.CsvDataSet;
import org.dbunit.operation.DatabaseOperation;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.transaction.annotation.Transactional;

import com.app.ecotiya.api.config.DbConfig;
import com.app.ecotiya.domain.entity.MInquiryKinds;
import com.app.ecotiya.domain.repository.base.EcotiyaBaseTest;

@SpringBootTest
@Transactional
@Import(DbConfig.class)
public class MInquiryKindsMapperTest extends EcotiyaBaseTest {

  @Autowired private MInquiryKindsMapper mapper;

  @DisplayName("INSERT TEST: Check if the data is inserted as expected.")
  @Test
  public void testInsert() {
    MInquiryKinds mInquiryKinds = new MInquiryKinds();
    mInquiryKinds.setInquiryKindCode("test");
    mInquiryKinds.setInquiryKindName("テスト");
    mInquiryKinds.setCreatedAt(LocalDateTime.of(2022, 05, 14, 05, 14, 00));
    mInquiryKinds.setUpdatedAt(LocalDateTime.of(2022, 05, 14, 05, 14, 00));

    assertEquals(1, mapper.insert(mInquiryKinds));
  }
}