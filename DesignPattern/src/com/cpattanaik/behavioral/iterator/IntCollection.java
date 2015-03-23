package com.cpattanaik.behavioral.iterator;


public class IntCollection implements ICollection {
    Object[] array = new Object[20];
    int length = 0;
	
	@Override
	public void add(Object x) {
		array[length] = x;
		length++;
	}
	
	@Override
	public IIterator iterator() {
		IntIterator iterator = new IntIterator();
		return iterator;
	}
	
	private class IntIterator implements IIterator{
        private int position = 0;
		
		@Override
		public boolean hasNext() {
			if(position < length){
				return true;
			}else{
				return false;
			}
			
		}

		@Override
		public Object next() {
			return (int)array[position++];
		}
		
	}

}
