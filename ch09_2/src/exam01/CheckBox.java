package exam01;

public class CheckBox {
	public static interface OnSelectListener {
        void onSelect(boolean isChecked); 
    }
    
    private OnSelectListener listener;
    
    public void setOnSelectListener(OnSelectListener listener) {
        this.listener = listener;
    }
    
    public void select() {
        if (listener != null) {
            listener.onSelect(true); 
        }
    }
}