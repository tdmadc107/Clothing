package com.manual.clothing.mapper;

import com.manual.clothing.model.Customer;
import com.manual.clothing.model.CustomerExample;
import com.manual.clothing.model.CustomerKey;
import com.manual.clothing.model.CustomerWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CustomerMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    long countByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int deleteByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(CustomerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int insert(CustomerWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int insertSelective(CustomerWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    List<CustomerWithBLOBs> selectByExampleWithBLOBs(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    List<Customer> selectByExample(CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    CustomerWithBLOBs selectByPrimaryKey(CustomerKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") CustomerWithBLOBs row, @Param("example") CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("row") CustomerWithBLOBs row, @Param("example") CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") Customer row, @Param("example") CustomerExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CustomerWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(CustomerWithBLOBs row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Customer row);
}