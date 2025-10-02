package androidx.constraintlayout.motion.widget;

import YU.a;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionLayout.StateCache;
import androidx.constraintlayout.motion.widget.ViewTransitionController;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.medallia.digital.mobilesdk.q2;
import com.woolworths.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes2.dex */
public class MotionScene {

    /* renamed from: a, reason: collision with root package name */
    public final MotionLayout f2343a;
    public final StateSet b;
    public Transition c;
    public final ArrayList d;
    public final Transition e;
    public final ArrayList f;
    public final SparseArray g;
    public final HashMap h;
    public final SparseIntArray i;
    public int j;
    public int k;
    public MotionEvent l;
    public boolean m;
    public boolean n;
    public MotionLayout.MotionTracker o;
    public boolean p;
    public final ViewTransitionController q;
    public float r;
    public float s;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public MotionScene(Context context, MotionLayout motionLayout, int i) throws XmlPullParserException, Resources.NotFoundException, IOException {
        this.b = null;
        this.c = null;
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.e = null;
        this.f = new ArrayList();
        this.g = new SparseArray();
        this.h = new HashMap();
        this.i = new SparseIntArray();
        this.j = 400;
        this.k = 0;
        this.m = false;
        this.n = false;
        this.f2343a = motionLayout;
        this.q = new ViewTransitionController(motionLayout);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            Transition transition = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                i(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case -1239391468:
                            if (name.equals("KeyFrameSet")) {
                                KeyFrames keyFrames = new KeyFrames(context, xml);
                                if (transition != null) {
                                    transition.k.add(keyFrames);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case -687739768:
                            if (name.equals("Include")) {
                                k(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 61998586:
                            if (name.equals("ViewTransition")) {
                                ViewTransition viewTransition = new ViewTransition(context, xml);
                                ViewTransitionController viewTransitionController = this.q;
                                viewTransitionController.b.add(viewTransition);
                                viewTransitionController.c = null;
                                int i2 = viewTransition.b;
                                if (i2 == 4) {
                                    ConstraintLayout.getSharedValues().a(viewTransition.u, new ViewTransitionController.AnonymousClass1());
                                    break;
                                } else if (i2 == 5) {
                                    ConstraintLayout.getSharedValues().a(viewTransition.u, new ViewTransitionController.AnonymousClass1());
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 269306229:
                            if (name.equals("Transition")) {
                                transition = new Transition(this, context, xml);
                                arrayList.add(transition);
                                if (this.c == null && !transition.b) {
                                    this.c = transition;
                                    TouchResponse touchResponse = transition.l;
                                    if (touchResponse != null) {
                                        touchResponse.c(this.p);
                                    }
                                }
                                if (transition.b) {
                                    if (transition.c == -1) {
                                        this.e = transition;
                                    } else {
                                        this.f.add(transition);
                                    }
                                    arrayList.remove(transition);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 312750793:
                            if (name.equals("OnClick") && transition != null && !motionLayout.isInEditMode()) {
                                transition.m.add(new Transition.TransitionOnClick(context, transition, xml));
                                break;
                            } else {
                                break;
                            }
                            break;
                        case 327855227:
                            if (name.equals("OnSwipe")) {
                                if (transition == null) {
                                    Log.v("MotionScene", " OnSwipe (" + context.getResources().getResourceEntryName(i) + ".xml:" + xml.getLineNumber() + ")");
                                }
                                if (transition != null) {
                                    transition.l = new TouchResponse(context, motionLayout, xml);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                        case 793277014:
                            if (name.equals("MotionScene")) {
                                l(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                this.b = new StateSet(context, xml);
                                break;
                            } else {
                                break;
                            }
                        case 1942574248:
                            if (name.equals("include")) {
                                k(context, xml);
                                break;
                            } else {
                                break;
                            }
                    }
                }
            }
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
        }
        this.g.put(R.id.motion_base, new ConstraintSet());
        this.h.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    public static int d(Context context, String str) {
        int identifier;
        if (str.contains(q2.c)) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), "id", context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier == -1) {
            if (str.length() > 1) {
                return Integer.parseInt(str.substring(1));
            }
            Log.e("MotionScene", "error in parsing id");
        }
        return identifier;
    }

    public final boolean a(int i, MotionLayout motionLayout) {
        Transition transition;
        if (this.o != null) {
            return false;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            Transition transition2 = (Transition) it.next();
            int i2 = transition2.n;
            if (i2 != 0 && ((transition = this.c) != transition2 || (transition.r & 2) == 0)) {
                int i3 = transition2.d;
                MotionLayout.TransitionState transitionState = MotionLayout.TransitionState.g;
                MotionLayout.TransitionState transitionState2 = MotionLayout.TransitionState.f;
                MotionLayout.TransitionState transitionState3 = MotionLayout.TransitionState.e;
                if (i == i3 && (i2 == 4 || i2 == 2)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(transition2);
                    if (transition2.n == 4) {
                        motionLayout.D();
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        return true;
                    }
                    motionLayout.setProgress(1.0f);
                    motionLayout.q(true);
                    motionLayout.setState(transitionState3);
                    motionLayout.setState(transitionState2);
                    motionLayout.setState(transitionState);
                    motionLayout.y();
                    return true;
                }
                if (i == transition2.c && (i2 == 3 || i2 == 1)) {
                    motionLayout.setState(transitionState);
                    motionLayout.setTransition(transition2);
                    if (transition2.n == 3) {
                        motionLayout.m(BitmapDescriptorFactory.HUE_RED);
                        motionLayout.setState(transitionState3);
                        motionLayout.setState(transitionState2);
                        return true;
                    }
                    motionLayout.setProgress(BitmapDescriptorFactory.HUE_RED);
                    motionLayout.q(true);
                    motionLayout.setState(transitionState3);
                    motionLayout.setState(transitionState2);
                    motionLayout.setState(transitionState);
                    motionLayout.y();
                    return true;
                }
            }
        }
        return false;
    }

    public final ConstraintSet b(int i) {
        int iB;
        StateSet stateSet = this.b;
        if (stateSet != null && (iB = stateSet.b(i)) != -1) {
            i = iB;
        }
        SparseArray sparseArray = this.g;
        if (sparseArray.get(i) != null) {
            return (ConstraintSet) sparseArray.get(i);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + Debug.c(i, this.f2343a.getContext()) + " In MotionScene");
        return (ConstraintSet) sparseArray.get(sparseArray.keyAt(0));
    }

    public final int c() {
        Transition transition = this.c;
        return transition != null ? transition.h : this.j;
    }

    public final Interpolator e() {
        Transition transition = this.c;
        int i = transition.e;
        if (i == -2) {
            return AnimationUtils.loadInterpolator(this.f2343a.getContext(), this.c.g);
        }
        if (i == -1) {
            final Easing easingC = Easing.c(transition.f);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
                @Override // android.animation.TimeInterpolator
                public final float getInterpolation(float f) {
                    return (float) easingC.a(f);
                }
            };
        }
        if (i == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i == 1) {
            return new AccelerateInterpolator();
        }
        if (i == 2) {
            return new DecelerateInterpolator();
        }
        if (i == 4) {
            return new BounceInterpolator();
        }
        if (i == 5) {
            return new OvershootInterpolator();
        }
        if (i != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public final void f(MotionController motionController) {
        Transition transition = this.c;
        if (transition != null) {
            Iterator it = transition.k.iterator();
            while (it.hasNext()) {
                ((KeyFrames) it.next()).a(motionController);
            }
        } else {
            Transition transition2 = this.e;
            if (transition2 != null) {
                Iterator it2 = transition2.k.iterator();
                while (it2.hasNext()) {
                    ((KeyFrames) it2.next()).a(motionController);
                }
            }
        }
    }

    public final float g() {
        TouchResponse touchResponse;
        Transition transition = this.c;
        return (transition == null || (touchResponse = transition.l) == null) ? BitmapDescriptorFactory.HUE_RED : touchResponse.t;
    }

    public final int h() {
        Transition transition = this.c;
        if (transition == null) {
            return -1;
        }
        return transition.d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int i(android.content.Context r14, android.content.res.XmlResourceParser r15) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.i(android.content.Context, android.content.res.XmlResourceParser):int");
    }

    public final int j(int i, Context context) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (2 == eventType && "ConstraintSet".equals(name)) {
                    i = i(context, xml);
                    return i;
                }
            }
            return -1;
        } catch (IOException e) {
            Log.e("MotionScene", "Error parsing resource: " + i, e);
            return -1;
        } catch (XmlPullParserException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i, e2);
            return -1;
        }
    }

    public final void k(Context context, XmlResourceParser xmlResourceParser) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.H);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                j(typedArrayObtainStyledAttributes.getResourceId(index, -1), context);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void l(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.w);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int i2 = typedArrayObtainStyledAttributes.getInt(index, this.j);
                this.j = i2;
                if (i2 < 8) {
                    this.j = 8;
                }
            } else if (index == 1) {
                this.k = typedArrayObtainStyledAttributes.getInteger(index, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void m(int i, MotionLayout motionLayout) {
        SparseArray sparseArray = this.g;
        ConstraintSet constraintSet = (ConstraintSet) sparseArray.get(i);
        String str = constraintSet.f2369a;
        HashMap map = constraintSet.g;
        constraintSet.b = str;
        int i2 = this.i.get(i);
        if (i2 > 0) {
            m(i2, motionLayout);
            ConstraintSet constraintSet2 = (ConstraintSet) sparseArray.get(i2);
            if (constraintSet2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/" + Debug.c(i2, this.f2343a.getContext()));
                return;
            }
            HashMap map2 = constraintSet2.g;
            constraintSet.b += q2.c + constraintSet2.b;
            for (Integer num : map2.keySet()) {
                num.getClass();
                ConstraintSet.Constraint constraint = (ConstraintSet.Constraint) map2.get(num);
                if (!map.containsKey(num)) {
                    map.put(num, new ConstraintSet.Constraint());
                }
                ConstraintSet.Constraint constraint2 = (ConstraintSet.Constraint) map.get(num);
                if (constraint2 != null) {
                    ConstraintSet.Layout layout = constraint2.e;
                    if (!layout.b) {
                        layout.a(constraint.e);
                    }
                    ConstraintSet.PropertySet propertySet = constraint2.c;
                    if (!propertySet.f2374a) {
                        ConstraintSet.PropertySet propertySet2 = constraint.c;
                        propertySet.f2374a = propertySet2.f2374a;
                        propertySet.b = propertySet2.b;
                        propertySet.d = propertySet2.d;
                        propertySet.e = propertySet2.e;
                        propertySet.c = propertySet2.c;
                    }
                    ConstraintSet.Transform transform = constraint2.f;
                    if (!transform.f2375a) {
                        transform.a(constraint.f);
                    }
                    ConstraintSet.Motion motion = constraint2.d;
                    if (!motion.f2373a) {
                        motion.a(constraint.d);
                    }
                    for (String str2 : constraint.g.keySet()) {
                        if (!constraint2.g.containsKey(str2)) {
                            constraint2.g.put(str2, (ConstraintAttribute) constraint.g.get(str2));
                        }
                    }
                }
            }
        } else {
            constraintSet.b = a.o(new StringBuilder(), constraintSet.b, "  layout");
            int childCount = motionLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = motionLayout.getChildAt(i3);
                ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                int id = childAt.getId();
                if (constraintSet.f && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (!map.containsKey(Integer.valueOf(id))) {
                    map.put(Integer.valueOf(id), new ConstraintSet.Constraint());
                }
                ConstraintSet.Constraint constraint3 = (ConstraintSet.Constraint) map.get(Integer.valueOf(id));
                if (constraint3 != null) {
                    ConstraintSet.PropertySet propertySet3 = constraint3.c;
                    ConstraintSet.Layout layout2 = constraint3.e;
                    ConstraintSet.Transform transform2 = constraint3.f;
                    if (!layout2.b) {
                        constraint3.d(id, layoutParams);
                        if (childAt instanceof ConstraintHelper) {
                            layout2.j0 = ((ConstraintHelper) childAt).getReferencedIds();
                            if (childAt instanceof Barrier) {
                                Barrier barrier = (Barrier) childAt;
                                layout2.o0 = barrier.getAllowsGoneWidget();
                                layout2.g0 = barrier.getType();
                                layout2.h0 = barrier.getMargin();
                            }
                        }
                        layout2.b = true;
                    }
                    if (!propertySet3.f2374a) {
                        propertySet3.b = childAt.getVisibility();
                        propertySet3.d = childAt.getAlpha();
                        propertySet3.f2374a = true;
                    }
                    if (!transform2.f2375a) {
                        transform2.f2375a = true;
                        transform2.b = childAt.getRotation();
                        transform2.c = childAt.getRotationX();
                        transform2.d = childAt.getRotationY();
                        transform2.e = childAt.getScaleX();
                        transform2.f = childAt.getScaleY();
                        float pivotX = childAt.getPivotX();
                        float pivotY = childAt.getPivotY();
                        if (pivotX != 0.0d || pivotY != 0.0d) {
                            transform2.g = pivotX;
                            transform2.h = pivotY;
                        }
                        transform2.j = childAt.getTranslationX();
                        transform2.k = childAt.getTranslationY();
                        transform2.l = childAt.getTranslationZ();
                        if (transform2.m) {
                            transform2.n = childAt.getElevation();
                        }
                    }
                }
            }
        }
        constraintSet.b(constraintSet);
    }

    public final void n(MotionLayout motionLayout) {
        int i = 0;
        loop0: while (true) {
            SparseArray sparseArray = this.g;
            if (i >= sparseArray.size()) {
                return;
            }
            int iKeyAt = sparseArray.keyAt(i);
            SparseIntArray sparseIntArray = this.i;
            int i2 = sparseIntArray.get(iKeyAt);
            int size = sparseIntArray.size();
            while (i2 > 0) {
                if (i2 == iKeyAt) {
                    break loop0;
                }
                int i3 = size - 1;
                if (size < 0) {
                    break loop0;
                }
                i2 = sparseIntArray.get(i2);
                size = i3;
            }
            m(iKeyAt, motionLayout);
            i++;
        }
        Log.e("MotionScene", "Cannot be derived from yourself");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void o(int r9, int r10) {
        /*
            r8 = this;
            r0 = -1
            androidx.constraintlayout.widget.StateSet r1 = r8.b
            if (r1 == 0) goto L18
            int r1 = r1.b(r9)
            if (r1 == r0) goto Lc
            goto Ld
        Lc:
            r1 = r9
        Ld:
            androidx.constraintlayout.widget.StateSet r2 = r8.b
            int r2 = r2.b(r10)
            if (r2 == r0) goto L16
            goto L1a
        L16:
            r2 = r10
            goto L1a
        L18:
            r1 = r9
            goto L16
        L1a:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r8.c
            if (r3 == 0) goto L27
            int r4 = r3.c
            if (r4 != r10) goto L27
            int r3 = r3.d
            if (r3 != r9) goto L27
            goto L52
        L27:
            java.util.ArrayList r3 = r8.d
            java.util.Iterator r4 = r3.iterator()
        L2d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L53
            java.lang.Object r5 = r4.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r5 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r5
            int r6 = r5.c
            if (r6 != r2) goto L41
            int r7 = r5.d
            if (r7 == r1) goto L47
        L41:
            if (r6 != r10) goto L2d
            int r6 = r5.d
            if (r6 != r9) goto L2d
        L47:
            r8.c = r5
            androidx.constraintlayout.motion.widget.TouchResponse r9 = r5.l
            if (r9 == 0) goto L52
            boolean r10 = r8.p
            r9.c(r10)
        L52:
            return
        L53:
            java.util.ArrayList r9 = r8.f
            java.util.Iterator r9 = r9.iterator()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r4 = r8.e
        L5b:
            boolean r5 = r9.hasNext()
            if (r5 == 0) goto L6d
            java.lang.Object r5 = r9.next()
            androidx.constraintlayout.motion.widget.MotionScene$Transition r5 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r5
            int r6 = r5.c
            if (r6 != r10) goto L5b
            r4 = r5
            goto L5b
        L6d:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r9 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r9.<init>(r8, r4)
            r9.d = r1
            r9.c = r2
            if (r1 == r0) goto L7b
            r3.add(r9)
        L7b:
            r8.c = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.o(int, int):void");
    }

    public final boolean p() {
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            if (((Transition) it.next()).l != null) {
                return true;
            }
        }
        Transition transition = this.c;
        return (transition == null || transition.l == null) ? false : true;
    }

    public static class Transition {

        /* renamed from: a, reason: collision with root package name */
        public final int f2345a;
        public final boolean b;
        public int c;
        public int d;
        public int e;
        public String f;
        public int g;
        public int h;
        public final float i;
        public final MotionScene j;
        public final ArrayList k;
        public TouchResponse l;
        public final ArrayList m;
        public final int n;
        public boolean o;
        public int p;
        public final int q;
        public final int r;

        public static class TransitionOnClick implements View.OnClickListener {
            public final Transition d;
            public final int e;
            public final int f;

            public TransitionOnClick(Context context, Transition transition, XmlResourceParser xmlResourceParser) {
                this.e = -1;
                this.f = 17;
                this.d = transition;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.y);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i = 0; i < indexCount; i++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i);
                    if (index == 1) {
                        this.e = typedArrayObtainStyledAttributes.getResourceId(index, this.e);
                    } else if (index == 0) {
                        this.f = typedArrayObtainStyledAttributes.getInt(index, this.f);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r8v4, types: [android.view.View] */
            public final void a(MotionLayout motionLayout, int i, Transition transition) {
                int i2 = this.e;
                MotionLayout motionLayoutFindViewById = motionLayout;
                if (i2 != -1) {
                    motionLayoutFindViewById = motionLayout.findViewById(i2);
                }
                if (motionLayoutFindViewById == null) {
                    Log.e("MotionScene", "OnClick could not find id " + i2);
                    return;
                }
                int i3 = transition.d;
                int i4 = transition.c;
                if (i3 == -1) {
                    motionLayoutFindViewById.setOnClickListener(this);
                    return;
                }
                int i5 = this.f;
                int i6 = i5 & 1;
                boolean z = false;
                boolean z2 = (i6 != 0 && i == i3) | (i6 != 0 && i == i3) | ((i5 & 256) != 0 && i == i3) | ((i5 & 16) != 0 && i == i4);
                if ((i5 & 4096) != 0 && i == i4) {
                    z = true;
                }
                if (z2 || z) {
                    motionLayoutFindViewById.setOnClickListener(this);
                }
            }

            public final void b(MotionLayout motionLayout) {
                int i = this.e;
                if (i == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + i);
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Transition transition = this.d;
                MotionScene motionScene = transition.j;
                Callback.g(view);
                try {
                    MotionLayout motionLayout = motionScene.f2343a;
                    if (!motionLayout.m) {
                        Callback.h();
                        return;
                    }
                    if (transition.d == -1) {
                        int currentState = motionLayout.getCurrentState();
                        if (currentState != -1) {
                            Transition transition2 = new Transition(motionScene, transition);
                            transition2.d = currentState;
                            transition2.c = transition.c;
                            motionLayout.setTransition(transition2);
                            motionLayout.D();
                            Callback.h();
                            return;
                        }
                        int i = transition.c;
                        if (motionLayout.isAttachedToWindow()) {
                            motionLayout.F(i, -1);
                        } else {
                            if (motionLayout.h0 == null) {
                                motionLayout.h0 = motionLayout.new StateCache();
                            }
                            motionLayout.h0.d = i;
                        }
                        Callback.h();
                        return;
                    }
                    Transition transition3 = motionScene.c;
                    int i2 = this.f;
                    int i3 = i2 & 1;
                    boolean z = false;
                    boolean z2 = true;
                    boolean z3 = (i3 == 0 && (i2 & 256) == 0) ? false : true;
                    int i4 = i2 & 16;
                    if (i4 == 0 && (i2 & 4096) == 0) {
                        z2 = false;
                    }
                    if (z3 && z2) {
                        if (transition3 != transition) {
                            motionLayout.setTransition(transition);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z2 = false;
                            z = z3;
                        }
                    } else {
                        z = z3;
                    }
                    if (transition != transition3) {
                        int i5 = transition.c;
                        int i6 = transition.d;
                        if (i6 != -1) {
                            int i7 = motionLayout.i;
                            if (i7 == i6 || i7 == i5) {
                            }
                        } else if (motionLayout.i != i5) {
                        }
                        Callback.h();
                    }
                    if (z && i3 != 0) {
                        motionLayout.setTransition(transition);
                        motionLayout.D();
                    } else if (z2 && i4 != 0) {
                        motionLayout.setTransition(transition);
                        motionLayout.m(BitmapDescriptorFactory.HUE_RED);
                    } else if (z && (i2 & 256) != 0) {
                        motionLayout.setTransition(transition);
                        motionLayout.setProgress(1.0f);
                    } else if (z2 && (i2 & 4096) != 0) {
                        motionLayout.setTransition(transition);
                        motionLayout.setProgress(BitmapDescriptorFactory.HUE_RED);
                    }
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        }

        public Transition(MotionScene motionScene, Transition transition) {
            this.f2345a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.k = new ArrayList();
            this.l = null;
            this.m = new ArrayList();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.j = motionScene;
            this.h = motionScene.j;
            if (transition != null) {
                this.p = transition.p;
                this.e = transition.e;
                this.f = transition.f;
                this.g = transition.g;
                this.h = transition.h;
                this.k = transition.k;
                this.i = transition.i;
                this.q = transition.q;
            }
        }

        public final void a() {
            TouchResponse touchResponse = this.l;
            if (touchResponse != null) {
                touchResponse.c = 5;
            }
        }

        public Transition(MotionScene motionScene, int i) {
            this.f2345a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.k = new ArrayList();
            this.l = null;
            this.m = new ArrayList();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.q = 0;
            this.r = 0;
            this.f2345a = -1;
            this.j = motionScene;
            this.d = R.id.view_transition;
            this.c = i;
            this.h = motionScene.j;
            this.q = motionScene.k;
        }

        public Transition(MotionScene motionScene, Context context, XmlResourceParser xmlResourceParser) throws Resources.NotFoundException {
            this.f2345a = -1;
            this.b = false;
            this.c = -1;
            this.d = -1;
            this.e = 0;
            this.f = null;
            this.g = -1;
            this.h = 400;
            this.i = BitmapDescriptorFactory.HUE_RED;
            this.k = new ArrayList();
            this.l = null;
            this.m = new ArrayList();
            this.n = 0;
            this.o = false;
            this.p = -1;
            this.r = 0;
            int i = motionScene.j;
            SparseArray sparseArray = motionScene.g;
            this.h = i;
            this.q = motionScene.k;
            this.j = motionScene;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.E);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 2) {
                    this.c = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.c);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.m(this.c, context);
                        sparseArray.append(this.c, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.c = motionScene.j(this.c, context);
                    }
                } else if (index == 3) {
                    this.d = typedArrayObtainStyledAttributes.getResourceId(index, this.d);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.d);
                    if ("layout".equals(resourceTypeName2)) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.m(this.d, context);
                        sparseArray.append(this.d, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.d = motionScene.j(this.d, context);
                    }
                } else if (index == 6) {
                    int i3 = typedArrayObtainStyledAttributes.peekValue(index).type;
                    if (i3 == 1) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.g = resourceId;
                        if (resourceId != -1) {
                            this.e = -2;
                        }
                    } else if (i3 == 3) {
                        String string = typedArrayObtainStyledAttributes.getString(index);
                        this.f = string;
                        if (string != null) {
                            if (string.indexOf(q2.c) > 0) {
                                this.g = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.e = -2;
                            } else {
                                this.e = -1;
                            }
                        }
                    } else {
                        this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    }
                } else if (index == 4) {
                    int i4 = typedArrayObtainStyledAttributes.getInt(index, this.h);
                    this.h = i4;
                    if (i4 < 8) {
                        this.h = 8;
                    }
                } else if (index == 8) {
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                } else if (index == 1) {
                    this.n = typedArrayObtainStyledAttributes.getInteger(index, this.n);
                } else if (index == 0) {
                    this.f2345a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2345a);
                } else if (index == 9) {
                    this.o = typedArrayObtainStyledAttributes.getBoolean(index, this.o);
                } else if (index == 7) {
                    this.p = typedArrayObtainStyledAttributes.getInteger(index, -1);
                } else if (index == 5) {
                    this.q = typedArrayObtainStyledAttributes.getInteger(index, 0);
                } else if (index == 10) {
                    this.r = typedArrayObtainStyledAttributes.getInteger(index, 0);
                }
            }
            if (this.d == -1) {
                this.b = true;
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
