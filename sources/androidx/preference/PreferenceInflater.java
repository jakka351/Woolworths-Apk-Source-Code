package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Collections;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
class PreferenceInflater {
    public static final Class[] e = {Context.class, AttributeSet.class};
    public static final HashMap f = new HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final Context f3603a;
    public final PreferenceManager c;
    public final Object[] b = new Object[2];
    public final String[] d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public PreferenceInflater(Context context, PreferenceManager preferenceManager) {
        this.f3603a = context;
        this.c = preferenceManager;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) throws NoSuchMethodException, ClassNotFoundException, SecurityException {
        Class<?> cls;
        HashMap map = f;
        Constructor<?> constructor = (Constructor) map.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f3603a.getClassLoader();
                    if (strArr == null || strArr.length == 0) {
                        cls = Class.forName(str, false, classLoader);
                    } else {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 != null) {
                                throw e2;
                            }
                            throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                        }
                    }
                    constructor = cls.getConstructor(e);
                    constructor.setAccessible(true);
                    map.put(str, constructor);
                } catch (ClassNotFoundException e4) {
                    throw e4;
                }
            } catch (Exception e5) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        Object[] objArr = this.b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            return -1 == str.indexOf(46) ? a(str, this.d, attributeSet) : a(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    public final PreferenceGroup c(XmlResourceParser xmlResourceParser) {
        int next;
        PreferenceGroup preferenceGroup;
        synchronized (this.b) {
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.b[0] = this.f3603a;
            do {
                try {
                    try {
                        next = xmlResourceParser.next();
                        if (next == 2) {
                            break;
                        }
                    } catch (IOException e2) {
                        InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e2.getMessage());
                        inflateException.initCause(e2);
                        throw inflateException;
                    } catch (XmlPullParserException e3) {
                        InflateException inflateException2 = new InflateException(e3.getMessage());
                        inflateException2.initCause(e3);
                        throw inflateException2;
                    }
                } catch (InflateException e4) {
                    throw e4;
                }
            } while (next != 1);
            if (next != 2) {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
            preferenceGroup = (PreferenceGroup) b(xmlResourceParser.getName(), attributeSetAsAttributeSet);
            preferenceGroup.p(this.c);
            d(xmlResourceParser, preferenceGroup, attributeSetAsAttributeSet);
        }
        return preferenceGroup;
    }

    public final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        long jLongValue;
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next == 3 && xmlPullParser.getDepth() <= depth) || next == 1) {
                return;
            }
            if (next == 2) {
                String name = xmlPullParser.getName();
                if ("intent".equals(name)) {
                    try {
                        preference.o = Intent.parseIntent(this.f3603a.getResources(), xmlPullParser, attributeSet);
                    } catch (IOException e2) {
                        XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException.initCause(e2);
                        throw xmlPullParserException;
                    }
                } else if ("extra".equals(name)) {
                    this.f3603a.getResources().parseBundleExtra("extra", attributeSet, preference.c());
                    try {
                        int depth2 = xmlPullParser.getDepth();
                        while (true) {
                            int next2 = xmlPullParser.next();
                            if (next2 == 1 || (next2 == 3 && xmlPullParser.getDepth() <= depth2)) {
                                break;
                            }
                        }
                    } catch (IOException e3) {
                        XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                        xmlPullParserException2.initCause(e3);
                        throw xmlPullParserException2;
                    }
                } else {
                    Preference preferenceB = b(name, attributeSet);
                    PreferenceGroup preferenceGroup = (PreferenceGroup) preference;
                    if (!preferenceGroup.Q.contains(preferenceB)) {
                        if (preferenceB.n != null) {
                            PreferenceGroup preferenceGroup2 = preferenceGroup;
                            while (true) {
                                PreferenceGroup preferenceGroup3 = preferenceGroup2.K;
                                if (preferenceGroup3 == null) {
                                    break;
                                } else {
                                    preferenceGroup2 = preferenceGroup3;
                                }
                            }
                            String str = preferenceB.n;
                            if (preferenceGroup2.C(str) != null) {
                                Log.e("PreferenceGroup", "Found duplicated key: \"" + str + "\". This can cause unintended behaviour, please use unique keys for every preference.");
                            }
                        }
                        int i = preferenceB.i;
                        if (i == Integer.MAX_VALUE) {
                            if (preferenceGroup.R) {
                                int i2 = preferenceGroup.S;
                                preferenceGroup.S = i2 + 1;
                                if (i2 != i) {
                                    preferenceB.i = i2;
                                    PreferenceGroupAdapter preferenceGroupAdapter = preferenceB.I;
                                    if (preferenceGroupAdapter != null) {
                                        preferenceGroupAdapter.J();
                                    }
                                }
                            }
                            if (preferenceB instanceof PreferenceGroup) {
                                ((PreferenceGroup) preferenceB).R = preferenceGroup.R;
                            }
                        }
                        int iBinarySearch = Collections.binarySearch(preferenceGroup.Q, preferenceB);
                        if (iBinarySearch < 0) {
                            iBinarySearch = (iBinarySearch * (-1)) - 1;
                        }
                        boolean zA = preferenceGroup.A();
                        if (preferenceB.x == zA) {
                            preferenceB.x = !zA;
                            preferenceB.n(preferenceB.A());
                            preferenceB.m();
                        }
                        synchronized (preferenceGroup) {
                            preferenceGroup.Q.add(iBinarySearch, preferenceB);
                        }
                        PreferenceManager preferenceManager = preferenceGroup.e;
                        String str2 = preferenceB.n;
                        if (str2 == null || !preferenceGroup.P.containsKey(str2)) {
                            synchronized (preferenceManager) {
                                jLongValue = preferenceManager.b;
                                preferenceManager.b = 1 + jLongValue;
                            }
                        } else {
                            jLongValue = ((Long) preferenceGroup.P.get(str2)).longValue();
                            preferenceGroup.P.remove(str2);
                        }
                        preferenceB.f = jLongValue;
                        preferenceB.g = true;
                        try {
                            preferenceB.p(preferenceManager);
                            preferenceB.g = false;
                            if (preferenceB.K != null) {
                                throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
                            }
                            preferenceB.K = preferenceGroup;
                            if (preferenceGroup.T) {
                                preferenceB.o();
                            }
                            PreferenceGroupAdapter preferenceGroupAdapter2 = preferenceGroup.I;
                            if (preferenceGroupAdapter2 != null) {
                                preferenceGroupAdapter2.J();
                            }
                        } catch (Throwable th) {
                            preferenceB.g = false;
                            throw th;
                        }
                    }
                    d(xmlPullParser, preferenceB, attributeSet);
                }
            }
        }
    }
}
