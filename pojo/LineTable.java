package com.happy.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.github.dreamyoung.mprelation.JoinColumn;
import com.github.dreamyoung.mprelation.OneToOne;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigInteger;

@Data
@NoArgsConstructor
public class LineTable {
    @TableId(value = "l_id",type = IdType.AUTO)//主键
    private Long lId;
    //设备id,一对一主键
    @TableField("f_id")
    private Long fId;
    //当前排队人数
    private Integer currentNumber;
    //预计等待时间
    private Integer waitingTime;
    //每分钟离开的人数
    private Integer personMinute;
    //外键
//    @OneToOne //一对一默认为立即加载，即@Lazy(false)或此时不标注
//    @JoinColumn(name = "fId",referencedColumnName="f_id")
//    private FacilitiesTable facilitiesTable;

}
