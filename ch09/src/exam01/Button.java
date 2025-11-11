package exam01;

public class Button {
	OnClickListener listener;
	public void SetOnClickListener(OnClickListener) {
			this.listener = listener;
	}

 
	public void Touch() {
		if(listener != null) {
				listener.OnClick();
    	}
	}

}
