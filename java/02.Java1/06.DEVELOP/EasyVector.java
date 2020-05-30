/*
 * @(#)EasyVector.java      1.1 97/3/27
 * 
 * Copyright (c) 1997 김덕태
 * 
 * 본 S/W는 누구나 자유롭게 사용, 수정, 배포할 수 있습니다.
 * 단, 본 S/W가 자유롭게 사용, 수정, 배포되는 것을
 * 방해하는 어떠한 행위도 금지됩니다.
 * 또한, 본 S/W를 사용함으로써 발생하는 어떠한 문제에
 * 대해서도 본 저자는 아무런 책임이 없음을 밝힙니다.
 * 등등등...
 */

/* 패키지 이름을 컴퓨터 이름 혹은 일부 생략된 이름,
   덧붙인 이름등으로 하는 것이 추천되는 표준이다.
   (다른 개발자의 패키지 이름과 우연히 충돌하는 경우를
    사전에 막을 수 있기 때문)
*/ 
package kr.ac.kaist;

import java.util.Vector;

/**
 * <code>EasyVector</code> 클래스는 자바 문서생성기 
 * <code>javadoc</code>를 사용해 보기 위한 클래스이다.
 * <p>
 * <code>Vector</code> 클래스는 배열과 달리 원소가 첨가될 때
 * 스스로 메모리가 확장될 수 있는 편리한 배열처럼 쓸 수 있다.
 * 그러나, 객체만이 올 수 있다는 점에서 기본자료형의 데이타를
 * 첨가하고자 할 때 wrapper 클래스 객체를 만들고, 
 * 기본자료형과 변환을 해 주어야 하는 등 다음과 같이 사용하기
 * 불편하다.
 * <p><blockquote><pre>
 *     Vector v1 = new Vector();
 *     v1.addElement(new Integer(3));
 *     v1.addElement(new Integer(8));
 *     int i1 = ((Integer) v1.elementAt(0)).intValue();
 *     int i2 = ((Integer) v1.elementAt(1)).intValue();
 *     System.out.println(i1 + i2);
 * </pre></blockquote>
 * <p>
 * <code>EasyVector</code> 클래스는 <code>Vector</code>의
 * 하위클래스로서, 다음과 같이 간단하게 사용할 수 있다.
 * <p><blockquote><pre>
 *     EasyVector v1 = new EasyVector();
 *     v1.addInt(3);
 *     v1.addInt(8);
 *     int i1 = v1.getInt(0);
 *     int i2 = v1.getInt(1);
 *     System.out.println(i1 + i2);
 * </pre></blockquote>
 * <p>
 *
 * @author  김덕태 (dtkim@calab.kaist.ac.kr)
 * @version 1.1, 97/3/27
 * @see     java.util.Vector
 * @see     java.util.Vector#addElement(Object)
 * @see     java.util.Vector#elementAt(int)
 * @see     java.lang.Object
 * @see     java.lang.Integer
 * @see     java.lang.Integer#intValue()
 */
public class EasyVector extends java.util.Vector {
    /** 변수도 문서화 할 수 있다는 것을 보이기 위한 것일 뿐
     *  사용되지 않는 변수이다.
     */
    public int garbage;

    /**
     * 벡터의 초기 크기를 지정하지 않고 만들 수 있다.
     */
    public EasyVector() {
        // 다른 생성자가 정의되어 있는 경우에는
        // 이 생성자를 컴파일러가 만들어주지 않으므로
        // 내용이 없는 생성자를 만들었다.
    }

    /**
     * 첨가될 데이타의 많을 경우 벡터의 초기 크기를
     * 크게 해주면 더 효율적이다.
     * @param   capacity   벡터 초기 크기
     */
    public EasyVector(int capacity) {
        super(capacity);
    }

    /**
     * 주어진 <code>int</code> 데이타를 벡터의 마지막 원소로
     * 첨가한다.
     * @param  elem  첨가될 데이타
     * @see    java.util.Vector#addElement(java.lang.Object)
     */
    public final synchronized void addInt(int elem) {
        addElement(new Integer(elem));
    }

    /**
     * @return  주어진 위치 (index)의 <code>int</code>
     *          데이타를 반환한다.
     * @param  index  읽어내고자 하는 원소의 위치
     * @exception  ArrayIndexOutOfBoundsException 
     *             주어진 위치가 유효하지 않으면
     *    
     * @see     java.util.Vector#elementAt(java.lang.Object)
     */
    public final synchronized int getInt(int index) {
        /* 읽어내고자 하는 원소가 실제로는 int 데이타가
           아니거나 범위를 벗어나면 상위클래스 메쏘드인
           elementAt(int)와 자바 인터프리터가 알아서
           예외를 발생시키켜준다. */
        return ((Integer) elementAt(index)).intValue();
    }

    /**
     * @deprecated  이 클래스 버젼 1.0에서는 <code>int</code>
     *     데이타만을 지원하였으나, 버젼 2.0에서는 여러 
     *     기본자료형에 대응하는 <ode>getByte(int)</code>, 
     *     <code>getShort(int)</code>, ...등의 메쏘드가 
     *     제공될 예정이다. 그러나, 이 메쏘드는 
     *     <code>int</code> 데이타만을 다루면서도 이름이 
     *     적당치 않아 버젼 2.0에서는 제거될 것이다.
     */
    public final synchronized int getValue(int index) {
        return ((Integer) elementAt(index)).intValue();
    }

    /**
     *   클래스가 올바로 동작하는 지를 테스트하기 위한 
     *   메쏘드이다. 테스트하기 위한 클래스를 따로
     *   만들고 관리할 필요가 없으므로 이와 같이
     *   main 메쏘드를 사용하는 것이 바람직하다.
     */
    public static void main(String[] args) {
        EasyVector v1 = new EasyVector();
        v1.addInt(3);
        v1.addInt(8);
        int i1 = v1.getInt(0);
        int i2 = v1.getInt(1);
        System.out.println(i1 + i2);
        int i3 = v1.getValue(1);
    }
}
