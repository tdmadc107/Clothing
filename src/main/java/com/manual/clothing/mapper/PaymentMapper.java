package com.manual.clothing.mapper;

import com.manual.clothing.model.Payment;
import com.manual.clothing.model.PaymentExample;
import com.manual.clothing.model.PaymentKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    long countByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    int deleteByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(PaymentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    int insert(Payment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    int insertSelective(Payment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    List<Payment> selectByExample(PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    Payment selectByPrimaryKey(PaymentKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") Payment row, @Param("example") PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") Payment row, @Param("example") PaymentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Payment row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table payment
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Payment row);
}