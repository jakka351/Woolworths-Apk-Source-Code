package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.medallia.digital.mobilesdk.q2;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class ConstraintLayoutStates {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f2365a;
    public int b = -1;
    public int c = -1;
    public final SparseArray d = new SparseArray();
    public final SparseArray e = new SparseArray();

    public static class State {

        /* renamed from: a, reason: collision with root package name */
        public final int f2366a;
        public final ArrayList b = new ArrayList();
        public final int c;
        public final ConstraintSet d;

        public State(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), R.styleable.B);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.f2366a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2366a);
                } else if (index == 1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.c);
                    this.c = resourceId;
                    String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                    context.getResources().getResourceName(resourceId);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.d = constraintSet;
                        constraintSet.g((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class Variant {

        /* renamed from: a, reason: collision with root package name */
        public final float f2367a;
        public final float b;
        public final float c;
        public final float d;
        public final int e;
        public final ConstraintSet f;

        public Variant(Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f2367a = Float.NaN;
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
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        this.f = constraintSet;
                        constraintSet.g((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                    }
                } else if (index == 1) {
                    this.d = typedArrayObtainStyledAttributes.getDimension(index, this.d);
                } else if (index == 2) {
                    this.b = typedArrayObtainStyledAttributes.getDimension(index, this.b);
                } else if (index == 3) {
                    this.c = typedArrayObtainStyledAttributes.getDimension(index, this.c);
                } else if (index == 4) {
                    this.f2367a = typedArrayObtainStyledAttributes.getDimension(index, this.f2367a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        public final boolean a(float f, float f2) {
            float f3 = this.f2367a;
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

    public ConstraintLayoutStates(Context context, ConstraintLayout constraintLayout, int i) throws XmlPullParserException, Resources.NotFoundException, IOException, NumberFormatException {
        String str;
        this.f2365a = constraintLayout;
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            State state = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                a(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 80204913:
                            if (name.equals("State")) {
                                State state2 = new State(context, xml);
                                this.d.put(state2.f2366a, state2);
                                state = state2;
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                Variant variant = new Variant(context, xml);
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
                }
            }
        } catch (IOException e) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i, e2);
        }
    }

    public final void a(Context context, XmlResourceParser xmlResourceParser) throws NumberFormatException {
        ConstraintSet constraintSet = new ConstraintSet();
        int attributeCount = xmlResourceParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            String attributeName = xmlResourceParser.getAttributeName(i);
            String attributeValue = xmlResourceParser.getAttributeValue(i);
            if (attributeName != null && attributeValue != null && "id".equals(attributeName)) {
                int identifier = attributeValue.contains(q2.c) ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), "id", context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                constraintSet.n(context, xmlResourceParser);
                this.e.put(identifier, constraintSet);
                return;
            }
        }
    }

    public final void b(float f, float f2, int i) {
        int i2 = this.b;
        int i3 = 0;
        ConstraintLayout constraintLayout = this.f2365a;
        SparseArray sparseArray = this.d;
        if (i2 == i) {
            State state = i == -1 ? (State) sparseArray.valueAt(0) : (State) sparseArray.get(i2);
            int i4 = this.c;
            if (i4 == -1 || !((Variant) state.b.get(i4)).a(f, f2)) {
                ArrayList arrayList = state.b;
                while (true) {
                    if (i3 >= arrayList.size()) {
                        i3 = -1;
                        break;
                    } else if (((Variant) arrayList.get(i3)).a(f, f2)) {
                        break;
                    } else {
                        i3++;
                    }
                }
                ArrayList arrayList2 = state.b;
                if (this.c == i3) {
                    return;
                }
                ConstraintSet constraintSet = i3 == -1 ? null : ((Variant) arrayList2.get(i3)).f;
                if (i3 != -1) {
                    int i5 = ((Variant) arrayList2.get(i3)).e;
                }
                if (constraintSet == null) {
                    return;
                }
                this.c = i3;
                constraintSet.c(constraintLayout);
                return;
            }
            return;
        }
        this.b = i;
        State state2 = (State) sparseArray.get(i);
        ArrayList arrayList3 = state2.b;
        while (true) {
            if (i3 >= arrayList3.size()) {
                i3 = -1;
                break;
            } else if (((Variant) arrayList3.get(i3)).a(f, f2)) {
                break;
            } else {
                i3++;
            }
        }
        ArrayList arrayList4 = state2.b;
        ConstraintSet constraintSet2 = i3 == -1 ? state2.d : ((Variant) arrayList4.get(i3)).f;
        if (i3 != -1) {
            int i6 = ((Variant) arrayList4.get(i3)).e;
        }
        if (constraintSet2 != null) {
            this.c = i3;
            constraintSet2.c(constraintLayout);
            return;
        }
        Log.v("ConstraintLayoutStates", "NO Constraint set found ! id=" + i + ", dim =" + f + ", " + f2);
    }
}
