package md560f2c067a9ce98f0c46575fcbc694380;


public class TodoItemScreen
	extends android.app.Activity
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onCreate:(Landroid/os/Bundle;)V:GetOnCreate_Landroid_os_Bundle_Handler\n" +
			"";
		mono.android.Runtime.register ("StartappDroid.Screens.TodoItemScreen, StartappDroid, Version=1.0.6006.34683, Culture=neutral, PublicKeyToken=null", TodoItemScreen.class, __md_methods);
	}


	public TodoItemScreen () throws java.lang.Throwable
	{
		super ();
		if (getClass () == TodoItemScreen.class)
			mono.android.TypeManager.Activate ("StartappDroid.Screens.TodoItemScreen, StartappDroid, Version=1.0.6006.34683, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onCreate (android.os.Bundle p0)
	{
		n_onCreate (p0);
	}

	private native void n_onCreate (android.os.Bundle p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
