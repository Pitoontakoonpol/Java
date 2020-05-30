/*
 * @(#)EasyVector.java      1.1 97/3/27
 * 
 * Copyright (c) 1997 �����
 * 
 * �� S/W�� ������ �����Ӱ� ���, ����, ������ �� �ֽ��ϴ�.
 * ��, �� S/W�� �����Ӱ� ���, ����, �����Ǵ� ����
 * �����ϴ� ��� ������ �����˴ϴ�.
 * ����, �� S/W�� ��������ν� �߻��ϴ� ��� ������
 * ���ؼ��� �� ���ڴ� �ƹ��� å���� ������ �����ϴ�.
 * ����...
 */

/* ��Ű�� �̸��� ��ǻ�� �̸� Ȥ�� �Ϻ� ������ �̸�,
   ������ �̸������� �ϴ� ���� ��õ�Ǵ� ǥ���̴�.
   (�ٸ� �������� ��Ű�� �̸��� �쿬�� �浹�ϴ� ��츦
    ������ ���� �� �ֱ� ����)
*/ 
package kr.ac.kaist;

import java.util.Vector;

/**
 * <code>EasyVector</code> Ŭ������ �ڹ� ���������� 
 * <code>javadoc</code>�� ����� ���� ���� Ŭ�����̴�.
 * <p>
 * <code>Vector</code> Ŭ������ �迭�� �޸� ���Ұ� ÷���� ��
 * ������ �޸𸮰� Ȯ��� �� �ִ� ���� �迭ó�� �� �� �ִ�.
 * �׷���, ��ü���� �� �� �ִٴ� ������ �⺻�ڷ����� ����Ÿ��
 * ÷���ϰ��� �� �� wrapper Ŭ���� ��ü�� �����, 
 * �⺻�ڷ����� ��ȯ�� �� �־�� �ϴ� �� ������ ���� ����ϱ�
 * �����ϴ�.
 * <p><blockquote><pre>
 *     Vector v1 = new Vector();
 *     v1.addElement(new Integer(3));
 *     v1.addElement(new Integer(8));
 *     int i1 = ((Integer) v1.elementAt(0)).intValue();
 *     int i2 = ((Integer) v1.elementAt(1)).intValue();
 *     System.out.println(i1 + i2);
 * </pre></blockquote>
 * <p>
 * <code>EasyVector</code> Ŭ������ <code>Vector</code>��
 * ����Ŭ�����μ�, ������ ���� �����ϰ� ����� �� �ִ�.
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
 * @author  ����� (dtkim@calab.kaist.ac.kr)
 * @version 1.1, 97/3/27
 * @see     java.util.Vector
 * @see     java.util.Vector#addElement(Object)
 * @see     java.util.Vector#elementAt(int)
 * @see     java.lang.Object
 * @see     java.lang.Integer
 * @see     java.lang.Integer#intValue()
 */
public class EasyVector extends java.util.Vector {
    /** ������ ����ȭ �� �� �ִٴ� ���� ���̱� ���� ���� ��
     *  ������ �ʴ� �����̴�.
     */
    public int garbage;

    /**
     * ������ �ʱ� ũ�⸦ �������� �ʰ� ���� �� �ִ�.
     */
    public EasyVector() {
        // �ٸ� �����ڰ� ���ǵǾ� �ִ� ��쿡��
        // �� �����ڸ� �����Ϸ��� ��������� �����Ƿ�
        // ������ ���� �����ڸ� �������.
    }

    /**
     * ÷���� ����Ÿ�� ���� ��� ������ �ʱ� ũ�⸦
     * ũ�� ���ָ� �� ȿ�����̴�.
     * @param   capacity   ���� �ʱ� ũ��
     */
    public EasyVector(int capacity) {
        super(capacity);
    }

    /**
     * �־��� <code>int</code> ����Ÿ�� ������ ������ ���ҷ�
     * ÷���Ѵ�.
     * @param  elem  ÷���� ����Ÿ
     * @see    java.util.Vector#addElement(java.lang.Object)
     */
    public final synchronized void addInt(int elem) {
        addElement(new Integer(elem));
    }

    /**
     * @return  �־��� ��ġ (index)�� <code>int</code>
     *          ����Ÿ�� ��ȯ�Ѵ�.
     * @param  index  �о���� �ϴ� ������ ��ġ
     * @exception  ArrayIndexOutOfBoundsException 
     *             �־��� ��ġ�� ��ȿ���� ������
     *    
     * @see     java.util.Vector#elementAt(java.lang.Object)
     */
    public final synchronized int getInt(int index) {
        /* �о���� �ϴ� ���Ұ� �����δ� int ����Ÿ��
           �ƴϰų� ������ ����� ����Ŭ���� �޽����
           elementAt(int)�� �ڹ� ���������Ͱ� �˾Ƽ�
           ���ܸ� �߻���Ű���ش�. */
        return ((Integer) elementAt(index)).intValue();
    }

    /**
     * @deprecated  �� Ŭ���� ���� 1.0������ <code>int</code>
     *     ����Ÿ���� �����Ͽ�����, ���� 2.0������ ���� 
     *     �⺻�ڷ����� �����ϴ� <ode>getByte(int)</code>, 
     *     <code>getShort(int)</code>, ...���� �޽�尡 
     *     ������ �����̴�. �׷���, �� �޽��� 
     *     <code>int</code> ����Ÿ���� �ٷ�鼭�� �̸��� 
     *     ����ġ �ʾ� ���� 2.0������ ���ŵ� ���̴�.
     */
    public final synchronized int getValue(int index) {
        return ((Integer) elementAt(index)).intValue();
    }

    /**
     *   Ŭ������ �ùٷ� �����ϴ� ���� �׽�Ʈ�ϱ� ���� 
     *   �޽���̴�. �׽�Ʈ�ϱ� ���� Ŭ������ ����
     *   ����� ������ �ʿ䰡 �����Ƿ� �̿� ����
     *   main �޽�带 ����ϴ� ���� �ٶ����ϴ�.
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
