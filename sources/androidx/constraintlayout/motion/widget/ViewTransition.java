package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Rect;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.camera.core.impl.utils.futures.e;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.medallia.digital.mobilesdk.q2;
import com.woolworths.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class ViewTransition {

    /* renamed from: a, reason: collision with root package name */
    public int f2347a;
    public int e;
    public final KeyFrames f;
    public final ConstraintSet.Constraint g;
    public int j;
    public String k;
    public final Context o;
    public int b = -1;
    public boolean c = false;
    public int d = 0;
    public int h = -1;
    public int i = -1;
    public int l = 0;
    public String m = null;
    public int n = -1;
    public int p = -1;
    public int q = -1;
    public int r = -1;
    public int s = -1;
    public int t = -1;
    public int u = -1;

    public static class Animate {

        /* renamed from: a, reason: collision with root package name */
        public final int f2349a;
        public final int b;
        public final MotionController c;
        public final int d;
        public final ViewTransitionController f;
        public final Interpolator g;
        public float i;
        public float j;
        public final boolean m;
        public final KeyCache e = new KeyCache();
        public boolean h = false;
        public final Rect l = new Rect();
        public long k = System.nanoTime();

        public Animate(ViewTransitionController viewTransitionController, MotionController motionController, int i, int i2, int i3, Interpolator interpolator, int i4, int i5) {
            this.m = false;
            this.f = viewTransitionController;
            this.c = motionController;
            this.d = i2;
            if (viewTransitionController.e == null) {
                viewTransitionController.e = new ArrayList();
            }
            viewTransitionController.e.add(this);
            this.g = interpolator;
            this.f2349a = i4;
            this.b = i5;
            if (i3 == 3) {
                this.m = true;
            }
            this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            a();
        }

        public final void a() {
            boolean z = this.h;
            int i = this.b;
            int i2 = this.f2349a;
            Interpolator interpolator = this.g;
            ViewTransitionController viewTransitionController = this.f;
            MotionController motionController = this.c;
            if (z) {
                long jNanoTime = System.nanoTime();
                long j = jNanoTime - this.k;
                this.k = jNanoTime;
                float f = this.i - (((float) (j * 1.0E-6d)) * this.j);
                this.i = f;
                if (f < BitmapDescriptorFactory.HUE_RED) {
                    this.i = BitmapDescriptorFactory.HUE_RED;
                }
                boolean zI = motionController.i(interpolator == null ? this.i : interpolator.getInterpolation(this.i), jNanoTime, motionController.b, this.e);
                if (this.i <= BitmapDescriptorFactory.HUE_RED) {
                    if (i2 != -1) {
                        motionController.b.setTag(i2, Long.valueOf(System.nanoTime()));
                    }
                    if (i != -1) {
                        motionController.b.setTag(i, null);
                    }
                    viewTransitionController.f.add(this);
                }
                if (this.i > BitmapDescriptorFactory.HUE_RED || zI) {
                    viewTransitionController.f2350a.invalidate();
                    return;
                }
                return;
            }
            long jNanoTime2 = System.nanoTime();
            long j2 = jNanoTime2 - this.k;
            this.k = jNanoTime2;
            float f2 = (((float) (j2 * 1.0E-6d)) * this.j) + this.i;
            this.i = f2;
            if (f2 >= 1.0f) {
                this.i = 1.0f;
            }
            boolean zI2 = motionController.i(interpolator == null ? this.i : interpolator.getInterpolation(this.i), jNanoTime2, motionController.b, this.e);
            if (this.i >= 1.0f) {
                if (i2 != -1) {
                    motionController.b.setTag(i2, Long.valueOf(System.nanoTime()));
                }
                if (i != -1) {
                    motionController.b.setTag(i, null);
                }
                if (!this.m) {
                    viewTransitionController.f.add(this);
                }
            }
            if (this.i < 1.0f || zI2) {
                viewTransitionController.f2350a.invalidate();
            }
        }

        public final void b() {
            this.h = true;
            int i = this.d;
            if (i != -1) {
                this.j = i == 0 ? Float.MAX_VALUE : 1.0f / i;
            }
            this.f.f2350a.invalidate();
            this.k = System.nanoTime();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0097 A[Catch: IOException -> 0x0043, XmlPullParserException -> 0x0046, TryCatch #2 {IOException -> 0x0043, XmlPullParserException -> 0x0046, blocks: (B:3:0x0028, B:37:0x00ca, B:11:0x0037, B:18:0x0049, B:19:0x0051, B:36:0x0097, B:21:0x0055, B:26:0x0066, B:24:0x005e, B:27:0x006e, B:29:0x0074, B:30:0x0078, B:32:0x0080, B:33:0x0088, B:35:0x0090), top: B:42:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ViewTransition(android.content.Context r6, android.content.res.XmlResourceParser r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ViewTransition"
            r5.<init>()
            r2 = -1
            r5.b = r2
            r3 = 0
            r5.c = r3
            r5.d = r3
            r5.h = r2
            r5.i = r2
            r5.l = r3
            r3 = 0
            r5.m = r3
            r5.n = r2
            r5.p = r2
            r5.q = r2
            r5.r = r2
            r5.s = r2
            r5.t = r2
            r5.u = r2
            r5.o = r6
            int r2 = r7.getEventType()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
        L2c:
            r3 = 1
            if (r2 == r3) goto Ld7
            r3 = 2
            if (r2 == r3) goto L49
            r3 = 3
            if (r2 == r3) goto L37
            goto Lca
        L37:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            boolean r2 = r1.equals(r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r2 == 0) goto Lca
            goto Ld7
        L43:
            r6 = move-exception
            goto Ld0
        L46:
            r6 = move-exception
            goto Ld4
        L49:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            switch(r3) {
                case -1962203927: goto L88;
                case -1239391468: goto L78;
                case 61998586: goto L6e;
                case 366511058: goto L5e;
                case 1791837707: goto L55;
                default: goto L54;
            }     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
        L54:
            goto L97
        L55:
            java.lang.String r3 = "CustomAttribute"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            goto L66
        L5e:
            java.lang.String r3 = "CustomMethod"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
        L66:
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r5.g     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.util.HashMap r2 = r2.g     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            androidx.constraintlayout.widget.ConstraintAttribute.d(r6, r7, r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L6e:
            boolean r3 = r2.equals(r1)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            r5.d(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L78:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            androidx.constraintlayout.motion.widget.KeyFrames r2 = new androidx.constraintlayout.motion.widget.KeyFrames     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r2.<init>(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r5.f = r2     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L88:
            java.lang.String r3 = "ConstraintOverride"
            boolean r3 = r2.equals(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            if (r3 == 0) goto L97
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = androidx.constraintlayout.widget.ConstraintSet.e(r6, r7)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r5.g = r2     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto Lca
        L97:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r3.<init>()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.a()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r3.append(r4)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r4 = " unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r3.append(r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            android.util.Log.e(r1, r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r2.<init>()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r3 = ".xml:"
            r2.append(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            int r3 = r7.getLineNumber()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            r2.append(r3)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            android.util.Log.e(r1, r2)     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
        Lca:
            int r2 = r7.next()     // Catch: java.io.IOException -> L43 org.xmlpull.v1.XmlPullParserException -> L46
            goto L2c
        Ld0:
            android.util.Log.e(r1, r0, r6)
            goto Ld7
        Ld4:
            android.util.Log.e(r1, r0, r6)
        Ld7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.ViewTransition.<init>(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public final void a(ViewTransitionController viewTransitionController, MotionLayout motionLayout, int i, ConstraintSet constraintSet, View... viewArr) {
        Interpolator interpolatorLoadInterpolator;
        Interpolator interpolator;
        if (this.c) {
            return;
        }
        int i2 = this.e;
        KeyFrames keyFrames = this.f;
        int i3 = 0;
        if (i2 == 2) {
            View view = viewArr[0];
            MotionController motionController = new MotionController(view);
            MotionPaths motionPaths = motionController.f;
            motionPaths.f = BitmapDescriptorFactory.HUE_RED;
            motionPaths.g = BitmapDescriptorFactory.HUE_RED;
            motionController.H = true;
            motionPaths.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            motionController.g.d(view.getX(), view.getY(), view.getWidth(), view.getHeight());
            MotionConstrainedPoint motionConstrainedPoint = motionController.h;
            motionConstrainedPoint.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            motionConstrainedPoint.b(view);
            MotionConstrainedPoint motionConstrainedPoint2 = motionController.i;
            motionConstrainedPoint2.getClass();
            view.getX();
            view.getY();
            view.getWidth();
            view.getHeight();
            motionConstrainedPoint2.b(view);
            ArrayList arrayList = (ArrayList) keyFrames.f2332a.get(-1);
            if (arrayList != null) {
                motionController.w.addAll(arrayList);
            }
            motionController.l(motionLayout.getWidth(), motionLayout.getHeight(), System.nanoTime());
            int i4 = this.h;
            int i5 = this.i;
            int i6 = this.b;
            Context context = motionLayout.getContext();
            int i7 = this.l;
            if (i7 == -2) {
                interpolatorLoadInterpolator = AnimationUtils.loadInterpolator(context, this.n);
            } else if (i7 == -1) {
                final Easing easingC = Easing.c(this.m);
                interpolatorLoadInterpolator = new Interpolator() { // from class: androidx.constraintlayout.motion.widget.ViewTransition.1
                    @Override // android.animation.TimeInterpolator
                    public final float getInterpolation(float f) {
                        return (float) easingC.a(f);
                    }
                };
            } else if (i7 == 0) {
                interpolatorLoadInterpolator = new AccelerateDecelerateInterpolator();
            } else if (i7 == 1) {
                interpolatorLoadInterpolator = new AccelerateInterpolator();
            } else if (i7 == 2) {
                interpolatorLoadInterpolator = new DecelerateInterpolator();
            } else if (i7 == 4) {
                interpolatorLoadInterpolator = new BounceInterpolator();
            } else if (i7 == 5) {
                interpolatorLoadInterpolator = new OvershootInterpolator();
            } else {
                if (i7 != 6) {
                    interpolator = null;
                    new Animate(viewTransitionController, motionController, i4, i5, i6, interpolator, this.p, this.q);
                    return;
                }
                interpolatorLoadInterpolator = new AnticipateInterpolator();
            }
            interpolator = interpolatorLoadInterpolator;
            new Animate(viewTransitionController, motionController, i4, i5, i6, interpolator, this.p, this.q);
            return;
        }
        ConstraintSet.Constraint constraint = this.g;
        if (i2 == 1) {
            int[] constraintSetIds = motionLayout.getConstraintSetIds();
            int i8 = 0;
            while (i8 < constraintSetIds.length) {
                int i9 = constraintSetIds[i8];
                if (i9 != i) {
                    MotionScene motionScene = motionLayout.d;
                    ConstraintSet constraintSetB = motionScene == null ? null : motionScene.b(i9);
                    int length = viewArr.length;
                    for (int i10 = i3; i10 < length; i10++) {
                        ConstraintSet.Constraint constraintL = constraintSetB.l(viewArr[i10].getId());
                        if (constraint != null) {
                            constraint.a(constraintL);
                            constraintL.g.putAll(constraint.g);
                        }
                    }
                }
                i8++;
                i3 = 0;
            }
        }
        ConstraintSet constraintSet2 = new ConstraintSet();
        HashMap map = constraintSet2.g;
        map.clear();
        for (Integer num : constraintSet.g.keySet()) {
            ConstraintSet.Constraint constraint2 = (ConstraintSet.Constraint) constraintSet.g.get(num);
            if (constraint2 != null) {
                map.put(num, constraint2.clone());
            }
        }
        for (View view2 : viewArr) {
            ConstraintSet.Constraint constraintL2 = constraintSet2.l(view2.getId());
            if (constraint != null) {
                constraint.a(constraintL2);
                constraintL2.g.putAll(constraint.g);
            }
        }
        MotionScene motionScene2 = motionLayout.d;
        MotionLayout.Model model = motionLayout.m0;
        if (motionScene2 != null) {
            motionScene2.g.put(i, constraintSet2);
        }
        model.e(motionLayout.d.b(motionLayout.h), motionLayout.d.b(motionLayout.j));
        motionLayout.A();
        if (motionLayout.i == i) {
            constraintSet2.c(motionLayout);
        }
        MotionScene motionScene3 = motionLayout.d;
        if (motionScene3 != null) {
            motionScene3.g.put(R.id.view_transition, constraintSet);
        }
        model.e(motionLayout.d.b(motionLayout.h), motionLayout.d.b(motionLayout.j));
        motionLayout.A();
        if (motionLayout.i == R.id.view_transition) {
            constraintSet.c(motionLayout);
        }
        motionLayout.setState(R.id.view_transition, -1, -1);
        MotionScene.Transition transition = new MotionScene.Transition(motionLayout.d, i);
        for (View view3 : viewArr) {
            int i11 = this.h;
            if (i11 != -1) {
                transition.h = Math.max(i11, 8);
            }
            transition.p = this.d;
            int i12 = this.l;
            String str = this.m;
            int i13 = this.n;
            transition.e = i12;
            transition.f = str;
            transition.g = i13;
            int id = view3.getId();
            if (keyFrames != null) {
                ArrayList arrayList2 = (ArrayList) keyFrames.f2332a.get(-1);
                KeyFrames keyFrames2 = new KeyFrames();
                keyFrames2.f2332a = new HashMap();
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    Key keyClone = ((Key) it.next()).clone();
                    keyClone.b = id;
                    keyFrames2.b(keyClone);
                }
                transition.k.add(keyFrames2);
            }
        }
        motionLayout.setTransition(transition);
        e eVar = new e(3, this, viewArr);
        motionLayout.m(1.0f);
        motionLayout.i0 = eVar;
    }

    public final boolean b(View view) {
        int i = this.r;
        boolean z = i == -1 || view.getTag(i) != null;
        int i2 = this.s;
        return z && (i2 == -1 || view.getTag(i2) == null);
    }

    public final boolean c(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.j == -1 && this.k == null) || !b(view)) {
            return false;
        }
        if (view.getId() == this.j) {
            return true;
        }
        return this.k != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).Y) != null && str.matches(this.k);
    }

    public final void d(Context context, XmlResourceParser xmlResourceParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), androidx.constraintlayout.widget.R.styleable.G);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f2347a = typedArrayObtainStyledAttributes.getResourceId(index, this.f2347a);
            } else if (index == 8) {
                if (MotionLayout.s0) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                    this.j = resourceId;
                    if (resourceId == -1) {
                        this.k = typedArrayObtainStyledAttributes.getString(index);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                    this.k = typedArrayObtainStyledAttributes.getString(index);
                } else {
                    this.j = typedArrayObtainStyledAttributes.getResourceId(index, this.j);
                }
            } else if (index == 9) {
                this.b = typedArrayObtainStyledAttributes.getInt(index, this.b);
            } else if (index == 12) {
                this.c = typedArrayObtainStyledAttributes.getBoolean(index, this.c);
            } else if (index == 10) {
                this.d = typedArrayObtainStyledAttributes.getInt(index, this.d);
            } else if (index == 4) {
                this.h = typedArrayObtainStyledAttributes.getInt(index, this.h);
            } else if (index == 13) {
                this.i = typedArrayObtainStyledAttributes.getInt(index, this.i);
            } else if (index == 14) {
                this.e = typedArrayObtainStyledAttributes.getInt(index, this.e);
            } else if (index == 7) {
                int i2 = typedArrayObtainStyledAttributes.peekValue(index).type;
                if (i2 == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                    this.n = resourceId2;
                    if (resourceId2 != -1) {
                        this.l = -2;
                    }
                } else if (i2 == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.m = string;
                    if (string == null || string.indexOf(q2.c) <= 0) {
                        this.l = -1;
                    } else {
                        this.n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                        this.l = -2;
                    }
                } else {
                    this.l = typedArrayObtainStyledAttributes.getInteger(index, this.l);
                }
            } else if (index == 11) {
                this.p = typedArrayObtainStyledAttributes.getResourceId(index, this.p);
            } else if (index == 3) {
                this.q = typedArrayObtainStyledAttributes.getResourceId(index, this.q);
            } else if (index == 6) {
                this.r = typedArrayObtainStyledAttributes.getResourceId(index, this.r);
            } else if (index == 5) {
                this.s = typedArrayObtainStyledAttributes.getResourceId(index, this.s);
            } else if (index == 2) {
                this.u = typedArrayObtainStyledAttributes.getResourceId(index, this.u);
            } else if (index == 1) {
                this.t = typedArrayObtainStyledAttributes.getInteger(index, this.t);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public final String toString() {
        return "ViewTransition(" + Debug.c(this.f2347a, this.o) + ")";
    }
}
