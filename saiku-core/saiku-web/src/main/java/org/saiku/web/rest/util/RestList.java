package org.saiku.web.rest.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;

import org.saiku.web.rest.objects.AxisRestPojo;
import org.saiku.web.rest.objects.CubeRestPojo;
import org.saiku.web.rest.objects.DimensionRestPojo;
import org.saiku.web.rest.objects.HierarchyRestPojo;
import org.saiku.web.rest.objects.LevelRestPojo;
import org.saiku.web.rest.objects.MemberRestPojo;
import org.saiku.web.rest.objects.QueryRestPojo;
import org.saiku.web.rest.objects.resultset.Cell;


@XmlRootElement(name = "items")
@XmlAccessorType(XmlAccessType.FIELD)
public class RestList<T> implements List<T> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -733008764990264636L;

	@XmlElements(value = {
            @XmlElement(name="datasource", type=CubeRestPojo.class),
            @XmlElement(name="hierarchy", type=HierarchyRestPojo.class),
            @XmlElement(name="level", type=LevelRestPojo.class),
            @XmlElement(name="member", type=MemberRestPojo.class),
            @XmlElement(name="query", type=QueryRestPojo.class),
            @XmlElement(name="dimension", type=DimensionRestPojo.class),
            @XmlElement(name="axis", type=AxisRestPojo.class),
            @XmlElement(name="row", type=Cell.class)
	})
	private List<T> internalList;

	public RestList() {
		internalList = new ArrayList<T>();
	}
	public boolean add(T arg0) {
		return internalList.add(arg0);
	}

	public void add(int index, T element) {
		internalList.add(index, element);
	}

	public boolean addAll(Collection<? extends T> c) {
		return internalList.addAll(c);
	}

	public boolean addAll(int index, Collection<? extends T> c) {
		return internalList.addAll(index,c);
	}

	public void clear() {
		internalList.clear();
	}

	public boolean contains(Object o) {
		return internalList.contains(o);
	}

	public boolean containsAll(Collection<?> c) {
		return internalList.containsAll(c);
	}

	public T get(int index) {
		return internalList.get(index);

	}

	public int indexOf(Object o) {
		return internalList.indexOf(o);
	}

	public boolean isEmpty() {
		return internalList.isEmpty();
	}

	public Iterator<T> iterator() {
		return internalList.iterator();
	}

	public int lastIndexOf(Object o) {
		return internalList.lastIndexOf(o);
	}

	public ListIterator<T> listIterator() {
		return internalList.listIterator();
	}

	public ListIterator<T> listIterator(int index) {
		return internalList.listIterator(index);
	}

	public boolean remove(Object o) {
		return internalList.remove(o);
	}

	public T remove(int index) {
		return internalList.remove(index);
	}

	public boolean removeAll(Collection<?> c) {
		return internalList.removeAll(c);
	}

	public boolean retainAll(Collection<?> c) {
		return internalList.retainAll(c);
	}

	public T set(int index, T element) {
		return internalList.set(index, element);
	}

	public int size() {
		return internalList.size();
	}

	public List<T> subList(int fromIndex, int toIndex) {
		return internalList.subList(fromIndex, toIndex);
	}

	public Object[] toArray() {
		return internalList.toArray();
	}

	@SuppressWarnings("hiding")
	public <T> T[] toArray(T[] a) {
		return internalList.toArray(a);
	}

}
