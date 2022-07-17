/**
 * @ClassName: VariableTest1
 * @author: 蜡笔小猪
 * @Date: 2022/7/16 12:37
 * @Description:
 * Java定义的数据类型
 *
 * 一、变量按照数据类型来分：
 *
 * 	基本数据类型：
 * 		整型：byte \ short \ int \ long
 * 		浮点型：float \ double
 * 		字符型：char
 * 		布尔型：boolean
 *
 *
 * 	引用数据类型：
 * 		类(class)
 * 		接口(interface)
 * 		数组(array)
 *
 *
 * 二、变量在类中声明的位置：
 * 		成员变量  vs  局部变量
 *
 *
 * 	整数类型：
 * 	    java各整数类型有固定的表数范围和字段长度，不受具体OS的影响，以保证java程序的可移植性。
 *      java的整型常量默认为 int 型，声明long型常量须后加‘l’或‘L’
 *      java程序中变量通常声明为int型，除非不足以表示较大的数，才使用long
 *
 *  自动类型提升：
 *      结论：当容量小的数据类型的变量与容量大的数据类型的变量做运算时，结果自动提升为容量大的数据类型。
 * 	        byte 、char 、short --> int --> long --> float --> double
 *
 * 	    特别的：当byte、char、short三种类型的变量做运算时，结果为int型
 *
 *
 * 	强制类型转换：自动类型提升运算的逆运算。
 *      1.需要使用强转符：()
 *      2.注意点：强制类型转换，可能导致精度损失。
 */
public class VariableTest1 {
}
