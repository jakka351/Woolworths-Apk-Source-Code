package androidx.appcompat.view;

import YU.a;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuItemWrapperICS;
import androidx.appcompat.widget.DrawableUtils;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.view.ActionProvider;
import com.dynatrace.android.callback.Callback;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

@RestrictTo
/* loaded from: classes2.dex */
public class SupportMenuInflater extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;

    /* renamed from: a, reason: collision with root package name */
    public final Object[] f127a;
    public final Object[] b;
    public final Context c;
    public Object d;

    public static class InflatedOnMenuItemClickListener implements MenuItem.OnMenuItemClickListener {
        public static final Class[] f = {MenuItem.class};
        public Object d;
        public Method e;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Object obj = this.d;
            Method method = this.e;
            Callback.n(menuItem);
            try {
                try {
                    if (method.getReturnType() == Boolean.TYPE) {
                        return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                    }
                    method.invoke(obj, menuItem);
                    return true;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            } finally {
                Callback.o();
            }
        }
    }

    public class MenuState {
        public CharSequence A;
        public CharSequence B;

        /* renamed from: a, reason: collision with root package name */
        public final Menu f128a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public ActionProvider z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public MenuState(Menu menu) {
            this.f128a = menu;
        }

        public final Object a(String str, Class[] clsArr, Object[] objArr) throws NoSuchMethodException, SecurityException {
            try {
                Constructor<?> constructor = Class.forName(str, false, SupportMenuInflater.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void b(MenuItem menuItem) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SupportMenuInflater supportMenuInflater = SupportMenuInflater.this;
            Context context = supportMenuInflater.c;
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            if (this.y != null) {
                if (context.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (supportMenuInflater.d == null) {
                    supportMenuInflater.d = SupportMenuInflater.a(context);
                }
                Object obj = supportMenuInflater.d;
                String str = this.y;
                InflatedOnMenuItemClickListener inflatedOnMenuItemClickListener = new InflatedOnMenuItemClickListener();
                inflatedOnMenuItemClickListener.d = obj;
                Class<?> cls = obj.getClass();
                try {
                    inflatedOnMenuItemClickListener.e = cls.getMethod(str, InflatedOnMenuItemClickListener.f);
                    menuItem.setOnMenuItemClickListener(inflatedOnMenuItemClickListener);
                } catch (Exception e) {
                    StringBuilder sbU = a.u("Couldn't resolve menu item onClick handler ", str, " in class ");
                    sbU.append(cls.getName());
                    InflateException inflateException = new InflateException(sbU.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof MenuItemImpl) {
                    ((MenuItemImpl) menuItem).f(true);
                } else if (menuItem instanceof MenuItemWrapperICS) {
                    MenuItemWrapperICS menuItemWrapperICS = (MenuItemWrapperICS) menuItem;
                    SupportMenuItem supportMenuItem = menuItemWrapperICS.d;
                    try {
                        if (menuItemWrapperICS.e == null) {
                            menuItemWrapperICS.e = supportMenuItem.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemWrapperICS.e.invoke(supportMenuItem, Boolean.TRUE);
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str2 = this.x;
            if (str2 != null) {
                menuItem.setActionView((View) a(str2, SupportMenuInflater.e, supportMenuInflater.f127a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (z) {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            ActionProvider actionProvider = this.z;
            if (actionProvider != null) {
                if (menuItem instanceof SupportMenuItem) {
                    ((SupportMenuItem) menuItem).b(actionProvider);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z2 = menuItem instanceof SupportMenuItem;
            if (z2) {
                ((SupportMenuItem) menuItem).setContentDescription(charSequence);
            } else {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z2) {
                ((SupportMenuItem) menuItem).setTooltipText(charSequence2);
            } else {
                menuItem.setTooltipText(charSequence2);
            }
            char c = this.n;
            int i3 = this.o;
            if (z2) {
                ((SupportMenuItem) menuItem).setAlphabeticShortcut(c, i3);
            } else {
                menuItem.setAlphabeticShortcut(c, i3);
            }
            char c2 = this.p;
            int i4 = this.q;
            if (z2) {
                ((SupportMenuItem) menuItem).setNumericShortcut(c2, i4);
            } else {
                menuItem.setNumericShortcut(c2, i4);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z2) {
                    ((SupportMenuItem) menuItem).setIconTintMode(mode);
                } else {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z2) {
                    ((SupportMenuItem) menuItem).setIconTintList(colorStateList);
                } else {
                    menuItem.setIconTintList(colorStateList);
                }
            }
        }
    }

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public SupportMenuInflater(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.f127a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IllegalAccessException, IOException, IllegalArgumentException, InvocationTargetException {
        int i;
        XmlPullParser xmlPullParser2;
        ColorStateList colorStateList;
        MenuState menuState = new MenuState(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlPullParser.next();
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType != i) {
                if (eventType != 3) {
                    xmlPullParser2 = xmlPullParser;
                    z = z;
                } else {
                    String name2 = xmlPullParser.getName();
                    if (z2 && name2.equals(str)) {
                        xmlPullParser2 = xmlPullParser;
                        z2 = false;
                        str = null;
                    } else {
                        if (name2.equals("group")) {
                            menuState.b = 0;
                            menuState.c = 0;
                            menuState.d = 0;
                            menuState.e = 0;
                            menuState.f = true;
                            menuState.g = true;
                        } else if (name2.equals("item")) {
                            if (!menuState.h) {
                                ActionProvider actionProvider = menuState.z;
                                if (actionProvider == null || !actionProvider.a()) {
                                    menuState.h = true;
                                    menuState.b(menuState.f128a.add(menuState.b, menuState.i, menuState.j, menuState.k));
                                } else {
                                    menuState.h = true;
                                    menuState.b(menuState.f128a.addSubMenu(menuState.b, menuState.i, menuState.j, menuState.k).getItem());
                                }
                            }
                        } else if (name2.equals("menu")) {
                            xmlPullParser2 = xmlPullParser;
                            z = true;
                        }
                        xmlPullParser2 = xmlPullParser;
                        z = z;
                    }
                }
                eventType = xmlPullParser2.next();
                i = 2;
                z = z;
                z2 = z2;
            } else {
                if (!z2) {
                    String name3 = xmlPullParser.getName();
                    boolean zEquals = name3.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.r);
                        menuState.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        menuState.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        menuState.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        menuState.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        menuState.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        menuState.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else {
                        if (name3.equals("item")) {
                            TintTypedArray tintTypedArrayE = TintTypedArray.e(context, attributeSet, R.styleable.s);
                            TypedArray typedArray = tintTypedArrayE.b;
                            menuState.i = typedArray.getResourceId(2, 0);
                            menuState.j = (typedArray.getInt(5, menuState.c) & (-65536)) | (typedArray.getInt(6, menuState.d) & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
                            menuState.k = typedArray.getText(7);
                            menuState.l = typedArray.getText(8);
                            menuState.m = typedArray.getResourceId(0, 0);
                            String string = typedArray.getString(9);
                            menuState.n = string == null ? (char) 0 : string.charAt(0);
                            menuState.o = typedArray.getInt(16, 4096);
                            String string2 = typedArray.getString(10);
                            menuState.p = string2 == null ? (char) 0 : string2.charAt(0);
                            menuState.q = typedArray.getInt(20, 4096);
                            if (typedArray.hasValue(11)) {
                                menuState.r = typedArray.getBoolean(11, false) ? 1 : 0;
                            } else {
                                menuState.r = menuState.e;
                            }
                            menuState.s = typedArray.getBoolean(3, false);
                            menuState.t = typedArray.getBoolean(4, menuState.f);
                            menuState.u = typedArray.getBoolean(1, menuState.g);
                            menuState.v = typedArray.getInt(21, -1);
                            menuState.y = typedArray.getString(12);
                            menuState.w = typedArray.getResourceId(13, 0);
                            menuState.x = typedArray.getString(15);
                            String string3 = typedArray.getString(14);
                            boolean z3 = string3 != null;
                            if (z3 && menuState.w == 0 && menuState.x == null) {
                                menuState.z = (ActionProvider) menuState.a(string3, f, this.b);
                            } else {
                                if (z3) {
                                    Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                                }
                                menuState.z = null;
                            }
                            menuState.A = typedArray.getText(17);
                            menuState.B = typedArray.getText(22);
                            if (typedArray.hasValue(19)) {
                                menuState.D = DrawableUtils.c(typedArray.getInt(19, -1), menuState.D);
                                colorStateList = null;
                            } else {
                                colorStateList = null;
                                menuState.D = null;
                            }
                            if (typedArray.hasValue(18)) {
                                menuState.C = tintTypedArrayE.a(18);
                            } else {
                                menuState.C = colorStateList;
                            }
                            tintTypedArrayE.g();
                            menuState.h = false;
                            xmlPullParser2 = xmlPullParser;
                        } else if (name3.equals("menu")) {
                            menuState.h = true;
                            SubMenu subMenuAddSubMenu = menuState.f128a.addSubMenu(menuState.b, menuState.i, menuState.j, menuState.k);
                            menuState.b(subMenuAddSubMenu.getItem());
                            xmlPullParser2 = xmlPullParser;
                            b(xmlPullParser2, attributeSet, subMenuAddSubMenu);
                        } else {
                            xmlPullParser2 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser2.next();
                        i = 2;
                        z = z;
                        z2 = z2;
                    }
                }
                xmlPullParser2 = xmlPullParser;
                z = z;
            }
            eventType = xmlPullParser2.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof SupportMenu)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof MenuBuilder) {
                    MenuBuilder menuBuilder = (MenuBuilder) menu;
                    if (!menuBuilder.p) {
                        menuBuilder.B();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((MenuBuilder) menu).A();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuBuilder) menu).A();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
