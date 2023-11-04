package com.manual.clothing.mapper;

import com.manual.clothing.model.GiftCode;
import com.manual.clothing.model.GiftCodeExample;
import com.manual.clothing.model.GiftCodeKey;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface GiftCodeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    long countByExample(GiftCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    int deleteByExample(GiftCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(GiftCodeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    int insert(GiftCode row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    int insertSelective(GiftCode row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    List<GiftCode> selectByExample(GiftCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    GiftCode selectByPrimaryKey(GiftCodeKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("row") GiftCode row, @Param("example") GiftCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    int updateByExample(@Param("row") GiftCode row, @Param("example") GiftCodeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(GiftCode row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table gift_code
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(GiftCode row);
}