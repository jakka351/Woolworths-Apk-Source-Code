package com.bumptech.glide.request.target;

import android.content.Context;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.widget.ImageView;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.request.Request;
import com.bumptech.glide.request.SingleRequest;
import com.bumptech.glide.util.Preconditions;
import com.woolworths.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

@Deprecated
/* loaded from: classes4.dex */
public abstract class ViewTarget<T extends View, Z> extends BaseTarget<Z> {
    public final View e;
    public final SizeDeterminer f;

    /* renamed from: com.bumptech.glide.request.target.ViewTarget$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnAttachStateChangeListener {
        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            throw null;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
            throw null;
        }
    }

    @VisibleForTesting
    public static final class SizeDeterminer {
        public static Integer d;

        /* renamed from: a, reason: collision with root package name */
        public final View f13975a;
        public final ArrayList b = new ArrayList();
        public SizeDeterminerLayoutListener c;

        public static final class SizeDeterminerLayoutListener implements ViewTreeObserver.OnPreDrawListener {
            public final WeakReference d;

            public SizeDeterminerLayoutListener(SizeDeterminer sizeDeterminer) {
                this.d = new WeakReference(sizeDeterminer);
            }

            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                if (Log.isLoggable("ViewTarget", 2)) {
                    Log.v("ViewTarget", "OnGlobalLayoutListener called attachStateListener=" + this);
                }
                SizeDeterminer sizeDeterminer = (SizeDeterminer) this.d.get();
                if (sizeDeterminer == null) {
                    return true;
                }
                ArrayList arrayList = sizeDeterminer.b;
                View view = sizeDeterminer.f13975a;
                if (arrayList.isEmpty()) {
                    return true;
                }
                int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                int iA = sizeDeterminer.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
                int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                int iA2 = sizeDeterminer.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
                if (iA <= 0 && iA != Integer.MIN_VALUE) {
                    return true;
                }
                if (iA2 <= 0 && iA2 != Integer.MIN_VALUE) {
                    return true;
                }
                Iterator it = new ArrayList(arrayList).iterator();
                while (it.hasNext()) {
                    ((SizeReadyCallback) it.next()).b(iA, iA2);
                }
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                if (viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnPreDrawListener(sizeDeterminer.c);
                }
                sizeDeterminer.c = null;
                arrayList.clear();
                return true;
            }
        }

        public SizeDeterminer(View view) {
            this.f13975a = view;
        }

        public final int a(int i, int i2, int i3) {
            int i4 = i2 - i3;
            if (i4 > 0) {
                return i4;
            }
            int i5 = i - i3;
            if (i5 > 0) {
                return i5;
            }
            View view = this.f13975a;
            if (view.isLayoutRequested() || i2 != -2) {
                return 0;
            }
            if (Log.isLoggable("ViewTarget", 4)) {
                Log.i("ViewTarget", "Glide treats LayoutParams.WRAP_CONTENT as a request for an image the size of this device's screen dimensions. If you want to load the original image and are ok with the corresponding memory cost and OOMs (depending on the input size), use override(Target.SIZE_ORIGINAL). Otherwise, use LayoutParams.MATCH_PARENT, set layout_width and layout_height to fixed dimension, or use .override() with fixed dimensions.");
            }
            Context context = view.getContext();
            if (d == null) {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                Preconditions.c(windowManager, "Argument must not be null");
                Display defaultDisplay = windowManager.getDefaultDisplay();
                Point point = new Point();
                defaultDisplay.getSize(point);
                d = Integer.valueOf(Math.max(point.x, point.y));
            }
            return d.intValue();
        }
    }

    public ViewTarget(ImageView imageView) {
        Preconditions.c(imageView, "Argument must not be null");
        this.e = imageView;
        this.f = new SizeDeterminer(imageView);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public final Request a() {
        Object tag = this.e.getTag(R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof Request) {
            return (Request) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void b(SingleRequest singleRequest) {
        this.f.b.remove(singleRequest);
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void d(Drawable drawable) {
        SizeDeterminer sizeDeterminer = this.f;
        ViewTreeObserver viewTreeObserver = sizeDeterminer.f13975a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(sizeDeterminer.c);
        }
        sizeDeterminer.c = null;
        sizeDeterminer.b.clear();
    }

    @Override // com.bumptech.glide.request.target.Target
    public final void g(SingleRequest singleRequest) {
        SizeDeterminer sizeDeterminer = this.f;
        ArrayList arrayList = sizeDeterminer.b;
        View view = sizeDeterminer.f13975a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int iA = sizeDeterminer.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int iA2 = sizeDeterminer.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((iA > 0 || iA == Integer.MIN_VALUE) && (iA2 > 0 || iA2 == Integer.MIN_VALUE)) {
            singleRequest.b(iA, iA2);
            return;
        }
        if (!arrayList.contains(singleRequest)) {
            arrayList.add(singleRequest);
        }
        if (sizeDeterminer.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            SizeDeterminer.SizeDeterminerLayoutListener sizeDeterminerLayoutListener = new SizeDeterminer.SizeDeterminerLayoutListener(sizeDeterminer);
            sizeDeterminer.c = sizeDeterminerLayoutListener;
            viewTreeObserver.addOnPreDrawListener(sizeDeterminerLayoutListener);
        }
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public void h(Drawable drawable) {
    }

    @Override // com.bumptech.glide.request.target.BaseTarget, com.bumptech.glide.request.target.Target
    public final void i(Request request) {
        this.e.setTag(R.id.glide_custom_view_target_tag, request);
    }

    public final String toString() {
        return "Target for: " + this.e;
    }
}
