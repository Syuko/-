package com.hospital.dao.ifc;

import com.hospital.entity.Drug;
import com.hospital.entity.Prescribe;

import java.util.List;

public interface DrugDao {
    List<Drug> queryAllDrugs();

    Integer queryDrugNum(Integer drugId);

    Boolean insertND(Integer patientId, Integer nurseId, Integer drugId, Integer dpNum, String insertTime);

    Boolean updateDrug(Integer dpNum, Integer drugId);

    List<Prescribe> showPrescribe(Integer patientId);

    List<Prescribe> showAccount(Integer patientId);

    Boolean deleteDrug(Integer drugId);

    Boolean insertDrug(Integer drugId, String drugName, String drugType, double drugPrice, double drugRate, String drugAdd, Integer drugNum);

    Boolean updateDrugById(Integer drugId, String drugName, String drugType, double drugPrice, double drugRate, String drugAdd, Integer drugNum);
}
