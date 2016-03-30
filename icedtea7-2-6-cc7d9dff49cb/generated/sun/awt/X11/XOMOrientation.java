// This file is an automatically generated file, please do not edit this file, modify the WrapperGenerator.java file instead !

package sun.awt.X11;

import sun.misc.*;

import java.util.logging.*;
public class XOMOrientation extends XWrapperBase { 
	private Unsafe unsafe = XlibWrapper.unsafe; 
	private final boolean should_free_memory;
	public static int getSize() { return 8; }
	public int getDataSize() { return getSize(); }

	long pData;

	public long getPData() { return pData; }


	XOMOrientation(long addr) {
		log.finest("Creating");
		pData=addr;
		should_free_memory = false;
	}


	XOMOrientation() {
		log.finest("Creating");
		pData = unsafe.allocateMemory(getSize());
		should_free_memory = true;
	}


	public void dispose() {
		log.finest("Disposing");
		if (should_free_memory) {
			log.finest("freeing memory");
			unsafe.freeMemory(pData); 
	}
		}
	public int get_num_orientation() { log.finest("");return (Native.getInt(pData+0)); }
	public void set_num_orientation(int v) { log.finest(""); Native.putInt(pData+0, v); }
	public int get_orientation(int index) { log.finest(""); return Native.getInt(Native.getLong(pData+4)+index*4); }
	public long get_orientation() { log.finest("");return Native.getLong(pData+4); }
	public void set_orientation(long v) { log.finest(""); Native.putLong(pData + 4, v); }


	String getName() {
		return "XOMOrientation"; 
	}


	String getFieldsAsString() {
		String ret="";

		ret += ""+"num_orientation = " + get_num_orientation() +", ";
		ret += ""+"orientation = " + get_orientation() +", ";
		return ret;
	}


}


