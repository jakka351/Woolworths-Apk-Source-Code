package androidx.media3.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckedTextView;
import android.widget.LinearLayout;
import androidx.annotation.AttrRes;
import androidx.annotation.Nullable;
import androidx.media3.common.TrackGroup;
import androidx.media3.common.TrackSelectionOverride;
import androidx.media3.common.Tracks;
import androidx.media3.common.util.UnstableApi;
import com.dynatrace.android.callback.Callback;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@UnstableApi
/* loaded from: classes2.dex */
public class TrackSelectionView extends LinearLayout {
    public final int d;
    public final LayoutInflater e;
    public final CheckedTextView f;
    public final CheckedTextView g;
    public final ComponentListener h;
    public final ArrayList i;
    public final HashMap j;
    public boolean k;
    public boolean l;
    public TrackNameProvider m;
    public CheckedTextView[][] n;
    public boolean o;

    public class ComponentListener implements View.OnClickListener {
        public ComponentListener() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Callback.g(view);
            try {
                TrackSelectionView.a(TrackSelectionView.this, view);
            } finally {
                Callback.h();
            }
        }
    }

    public static final class TrackInfo {

        /* renamed from: a, reason: collision with root package name */
        public final Tracks.Group f3465a;
        public final int b;

        public TrackInfo(Tracks.Group group, int i) {
            this.f3465a = group;
            this.b = i;
        }
    }

    public interface TrackSelectionListener {
    }

    public TrackSelectionView(Context context) {
        this(context, null);
    }

    public static void a(TrackSelectionView trackSelectionView, View view) {
        HashMap map = trackSelectionView.j;
        boolean z = true;
        if (view == trackSelectionView.f) {
            trackSelectionView.o = true;
            map.clear();
        } else if (view == trackSelectionView.g) {
            trackSelectionView.o = false;
            map.clear();
        } else {
            trackSelectionView.o = false;
            Object tag = view.getTag();
            tag.getClass();
            TrackInfo trackInfo = (TrackInfo) tag;
            Tracks.Group group = trackInfo.f3465a;
            TrackGroup trackGroup = group.b;
            int i = trackInfo.b;
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(trackGroup);
            if (trackSelectionOverride == null) {
                if (!trackSelectionView.l && map.size() > 0) {
                    map.clear();
                }
                map.put(trackGroup, new TrackSelectionOverride(trackGroup, ImmutableList.w(Integer.valueOf(i))));
            } else {
                ArrayList arrayList = new ArrayList(trackSelectionOverride.b);
                boolean zIsChecked = ((CheckedTextView) view).isChecked();
                boolean z2 = trackSelectionView.k && group.c;
                if (!z2 && (!trackSelectionView.l || trackSelectionView.i.size() <= 1)) {
                    z = false;
                }
                if (zIsChecked && z) {
                    arrayList.remove(Integer.valueOf(i));
                    if (arrayList.isEmpty()) {
                        map.remove(trackGroup);
                    } else {
                        map.put(trackGroup, new TrackSelectionOverride(trackGroup, arrayList));
                    }
                } else if (!zIsChecked) {
                    if (z2) {
                        arrayList.add(Integer.valueOf(i));
                        map.put(trackGroup, new TrackSelectionOverride(trackGroup, arrayList));
                    } else {
                        map.put(trackGroup, new TrackSelectionOverride(trackGroup, ImmutableList.w(Integer.valueOf(i))));
                    }
                }
            }
        }
        trackSelectionView.b();
    }

    public final void b() {
        this.f.setChecked(this.o);
        boolean z = this.o;
        HashMap map = this.j;
        this.g.setChecked(!z && map.size() == 0);
        for (int i = 0; i < this.n.length; i++) {
            TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(((Tracks.Group) this.i.get(i)).b);
            int i2 = 0;
            while (true) {
                CheckedTextView[] checkedTextViewArr = this.n[i];
                if (i2 < checkedTextViewArr.length) {
                    if (trackSelectionOverride != null) {
                        Object tag = checkedTextViewArr[i2].getTag();
                        tag.getClass();
                        this.n[i][i2].setChecked(trackSelectionOverride.b.contains(Integer.valueOf(((TrackInfo) tag).b)));
                    } else {
                        checkedTextViewArr[i2].setChecked(false);
                    }
                    i2++;
                }
            }
        }
    }

    public final void c() {
        for (int childCount = getChildCount() - 1; childCount >= 3; childCount--) {
            removeViewAt(childCount);
        }
        ArrayList arrayList = this.i;
        boolean zIsEmpty = arrayList.isEmpty();
        CheckedTextView checkedTextView = this.g;
        CheckedTextView checkedTextView2 = this.f;
        if (zIsEmpty) {
            checkedTextView2.setEnabled(false);
            checkedTextView.setEnabled(false);
            return;
        }
        checkedTextView2.setEnabled(true);
        checkedTextView.setEnabled(true);
        this.n = new CheckedTextView[arrayList.size()][];
        boolean z = this.l && arrayList.size() > 1;
        for (int i = 0; i < arrayList.size(); i++) {
            Tracks.Group group = (Tracks.Group) arrayList.get(i);
            boolean z2 = this.k && group.c;
            CheckedTextView[][] checkedTextViewArr = this.n;
            int i2 = group.f2885a;
            checkedTextViewArr[i] = new CheckedTextView[i2];
            TrackInfo[] trackInfoArr = new TrackInfo[i2];
            for (int i3 = 0; i3 < group.f2885a; i3++) {
                trackInfoArr[i3] = new TrackInfo(group, i3);
            }
            for (int i4 = 0; i4 < i2; i4++) {
                LayoutInflater layoutInflater = this.e;
                if (i4 == 0) {
                    addView(layoutInflater.inflate(com.woolworths.R.layout.exo_list_divider, (ViewGroup) this, false));
                }
                CheckedTextView checkedTextView3 = (CheckedTextView) layoutInflater.inflate((z2 || z) ? android.R.layout.simple_list_item_multiple_choice : android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
                checkedTextView3.setBackgroundResource(this.d);
                TrackNameProvider trackNameProvider = this.m;
                TrackInfo trackInfo = trackInfoArr[i4];
                checkedTextView3.setText(trackNameProvider.a(trackInfo.f3465a.a(trackInfo.b)));
                checkedTextView3.setTag(trackInfoArr[i4]);
                if (group.b(i4)) {
                    checkedTextView3.setFocusable(true);
                    checkedTextView3.setOnClickListener(this.h);
                } else {
                    checkedTextView3.setFocusable(false);
                    checkedTextView3.setEnabled(false);
                }
                this.n[i][i4] = checkedTextView3;
                addView(checkedTextView3);
            }
        }
        b();
    }

    public boolean getIsDisabled() {
        return this.o;
    }

    public Map<TrackGroup, TrackSelectionOverride> getOverrides() {
        return this.j;
    }

    public void setAllowAdaptiveSelections(boolean z) {
        if (this.k != z) {
            this.k = z;
            c();
        }
    }

    public void setAllowMultipleOverrides(boolean z) {
        if (this.l != z) {
            this.l = z;
            if (!z) {
                HashMap map = this.j;
                if (map.size() > 1) {
                    HashMap map2 = new HashMap();
                    int i = 0;
                    while (true) {
                        ArrayList arrayList = this.i;
                        if (i >= arrayList.size()) {
                            break;
                        }
                        TrackSelectionOverride trackSelectionOverride = (TrackSelectionOverride) map.get(((Tracks.Group) arrayList.get(i)).b);
                        if (trackSelectionOverride != null && map2.isEmpty()) {
                            map2.put(trackSelectionOverride.f2880a, trackSelectionOverride);
                        }
                        i++;
                    }
                    map.clear();
                    map.putAll(map2);
                }
            }
            c();
        }
    }

    public void setShowDisableOption(boolean z) {
        this.f.setVisibility(z ? 0 : 8);
    }

    public void setTrackNameProvider(TrackNameProvider trackNameProvider) {
        trackNameProvider.getClass();
        this.m = trackNameProvider;
        c();
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackSelectionView(Context context, @Nullable AttributeSet attributeSet, @AttrRes int i) {
        super(context, attributeSet, i);
        setOrientation(1);
        setSaveFromParentEnabled(false);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.selectableItemBackground});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.d = resourceId;
        typedArrayObtainStyledAttributes.recycle();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        this.e = layoutInflaterFrom;
        ComponentListener componentListener = new ComponentListener();
        this.h = componentListener;
        this.m = new DefaultTrackNameProvider(getResources());
        this.i = new ArrayList();
        this.j = new HashMap();
        CheckedTextView checkedTextView = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.f = checkedTextView;
        checkedTextView.setBackgroundResource(resourceId);
        checkedTextView.setText(com.woolworths.R.string.exo_track_selection_none);
        checkedTextView.setEnabled(false);
        checkedTextView.setFocusable(true);
        checkedTextView.setOnClickListener(componentListener);
        checkedTextView.setVisibility(8);
        addView(checkedTextView);
        addView(layoutInflaterFrom.inflate(com.woolworths.R.layout.exo_list_divider, (ViewGroup) this, false));
        CheckedTextView checkedTextView2 = (CheckedTextView) layoutInflaterFrom.inflate(android.R.layout.simple_list_item_single_choice, (ViewGroup) this, false);
        this.g = checkedTextView2;
        checkedTextView2.setBackgroundResource(resourceId);
        checkedTextView2.setText(com.woolworths.R.string.exo_track_selection_auto);
        checkedTextView2.setEnabled(false);
        checkedTextView2.setFocusable(true);
        checkedTextView2.setOnClickListener(componentListener);
        addView(checkedTextView2);
    }
}
