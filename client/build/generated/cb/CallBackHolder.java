package cb;

/**
 * Generated from IDL interface "CallBack".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at Apr 1, 2016 11:40:43 AM
 */

public final class CallBackHolder	implements org.omg.CORBA.portable.Streamable{
	 public CallBack value;
	public CallBackHolder()
	{
	}
	public CallBackHolder (final CallBack initial)
	{
		value = initial;
	}
	public org.omg.CORBA.TypeCode _type()
	{
		return CallBackHelper.type();
	}
	public void _read (final org.omg.CORBA.portable.InputStream in)
	{
		value = CallBackHelper.read (in);
	}
	public void _write (final org.omg.CORBA.portable.OutputStream _out)
	{
		CallBackHelper.write (_out,value);
	}
}
