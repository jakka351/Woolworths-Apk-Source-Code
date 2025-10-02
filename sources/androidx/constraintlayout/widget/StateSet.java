package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class StateSet {

    /* renamed from: a, reason: collision with root package name */
    public final int f2378a;
    public final SparseArray b = new SparseArray();

    public static class State {

        /* renamed from: a, reason: collision with root package name */
        public final int f2379a;
        public final ArrayList b = new ArrayList();
        public final int c;

        public State(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.B);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2379a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2379a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                    this.c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Variant {

        /* renamed from: a, reason: collision with root package name */
        public final float f2380a;
        public final float b;
        public final float c;
        public final float d;
        public final int e;

        public Variant(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f2380a = Float.NaN;
            this.b = Float.NaN;
            this.c = Float.NaN;
            this.d = Float.NaN;
            this.e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.F);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    this.e = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    "layout".equals(resourceTypeName);
                } else if (index == 1) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
                } else if (index == 3) {
                    this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
                } else if (index == 4) {
                    this.f2380a = typedArrayObtainStyledAttributes.getDimension(index, this.f2380a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f, float f2) {
            float f3 = this.f2380a;
            if (!Float.isNaN(f3) && f < f3) {
                return false;
            }
            float f4 = this.b;
            if (!Float.isNaN(f4) && f2 < f4) {
                return false;
            }
            float f5 = this.c;
            if (!Float.isNaN(f5) && f > f5) {
                return false;
            }
            float f6 = this.d;
            return Float.isNaN(f6) || f2 <= f6;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public StateSet(Context context, XmlResourceParser xmlResourceParser) throws XmlPullParserException, IOException {
        this.f2378a = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.C);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2378a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2378a);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            State state = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                state = new State(context, xmlResourceParser);
                                this.b.put(state.f2379a, state);
                                break;
                            } else {
                                break;
                            }
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                Variant variant = new Variant(context, xmlResourceParser);
                                if (state != null) {
                                    state.b.add(variant);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing XML resource", e2);
        }
    }

    public final int a(int i, float f, float f2, int i2) {
        State state = (State) this.b.get(i2);
        if (state == null) {
            return i2;
        }
        ArrayList arrayList = state.b;
        int i3 = state.c;
        if (f != -1.0f && f2 != -1.0f) {
            Iterator it = arrayList.iterator();
            Variant variant = null;
            while (it.hasNext()) {
                Variant variant2 = (Variant) it.next();
                if (variant2.a(f, f2)) {
                    if (i != variant2.e) {
                        variant = variant2;
                    }
                }
            }
            return variant != null ? variant.e : i3;
        }
        if (i3 != i) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (i == ((Variant) it2.next()).e) {
                }
            }
            return i3;
        }
        return i;
    }

    public final int b(int i) {
        float f = -1;
        int i2 = 0;
        SparseArray sparseArray = this.b;
        if (-1 == i) {
            State state = i == -1 ? (State) sparseArray.valueAt(0) : (State) sparseArray.get(-1);
            if (state != null) {
                ArrayList arrayList = state.b;
                while (true) {
                    if (i2 >= arrayList.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((Variant) arrayList.get(i2)).a(f, f)) {
                        break;
                    }
                    i2++;
                }
                if (-1 != i2) {
                    return i2 == -1 ? state.c : ((Variant) arrayList.get(i2)).e;
                }
            }
        } else {
            State state2 = (State) sparseArray.get(i);
            if (state2 != null) {
                ArrayList arrayList2 = state2.b;
                while (true) {
                    if (i2 >= arrayList2.size()) {
                        i2 = -1;
                        break;
                    }
                    if (((Variant) arrayList2.get(i2)).a(f, f)) {
                        break;
                    }
                    i2++;
                }
                return i2 == -1 ? state2.c : ((Variant) arrayList2.get(i2)).e;
            }
        }
        return -1;
    }
}
