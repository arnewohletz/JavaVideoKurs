
public class DatenPaket
{
	private final int a;
	private final int b;
	private final int c;
	private final int d;
	private final int e;
	private final int f;

	public String getDatenPaket()
	{
		return (this.a + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f);

	}

	public DatenPaket(int a, int b, int c, int d, int e, int f)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
		this.f = f;
	}

	public DatenPaket(int a, int b, int c, int d, int e)
	{
		this(a, b, c, d, e, e + 1);
		/*Abkürzung für
		 * this.a = a; this.b = b; this.c = c; this.d = d; this.e = e; this.f =
		 * e + 1;
		 */
	}

	public DatenPaket(int a, int b, int c, int d)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = d + 1;
		this.f = d + 2;
	}

	public DatenPaket(int a, int b, int c)
	{
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = c + 1;
		this.e = c + 2;
		this.f = c + 3;
	}

	public DatenPaket(int a, int b)
	{
		this.a = a;
		this.b = b;
		this.c = b + 1;
		this.d = b + 2;
		this.e = b + 3;
		this.f = b + 4;
	}

	public DatenPaket(int a)
	{
		this(a, a+1);
		
		/*Abkürzung für:
		this.a = a;
		this.b = a + 1;
		this.c = a + 2;
		this.d = a + 3;
		this.e = a + 4;
		this.f = a + 5;*/
	}

}
