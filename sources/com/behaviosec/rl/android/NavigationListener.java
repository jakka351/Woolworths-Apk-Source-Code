package com.behaviosec.rl.android;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import com.behaviosec.rl.uuxuuuu;
import com.behaviosec.rl.yllylll;
import com.behaviosec.rl.ylyylll;
import com.behaviosec.rl.yylylll;
import com.behaviosec.rl.yyyllll;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes4.dex */
public class NavigationListener implements ViewGroup.OnHierarchyChangeListener {
    public static int h006800680068h0068h0068 = 2;
    public static int h0068h0068h0068h0068 = 0;
    public static int hh00680068h0068h0068 = 1;
    public static int hhh0068h0068h0068 = 27;
    private SyncedJSONArray x00780078xx00780078;
    private BehavioButtonTouchListener x0078x0078x00780078;
    private long xx0078xx00780078;
    private boolean xxx0078x00780078;

    public NavigationListener(@NonNull ViewGroup viewGroup) {
        this(viewGroup, false);
    }

    public static /* synthetic */ long d006400640064d00640064(NavigationListener navigationListener) {
        int i = hhh0068h0068h0068;
        if (((hh00680068h0068h0068 + i) * i) % h006800680068h0068h0068 != h0068h0068h0068h0068) {
            hhh0068h0068h0068 = 50;
            h0068h0068h0068h0068 = 42;
        }
        return navigationListener.xx0078xx00780078;
    }

    private void d00640064d006400640064(@NonNull List<EditText> list) {
        for (EditText editText : list) {
            final View.OnFocusChangeListener onFocusChangeListener = editText.getOnFocusChangeListener();
            View.OnFocusChangeListener onFocusChangeListener2 = new View.OnFocusChangeListener() { // from class: com.behaviosec.rl.android.NavigationListener.1
                public static int h00680068h00680068h0068 = 18;
                public static int h0068h006800680068h0068 = 1;
                public static int hh0068006800680068h0068 = 2;
                public static int hhh006800680068h0068;

                public static int h00680068006800680068h0068() {
                    return 72;
                }

                @Override // android.view.View.OnFocusChangeListener
                public void onFocusChange(View view, boolean z) {
                    NavigationListener navigationListener;
                    String strPppp0070ppp;
                    View.OnFocusChangeListener onFocusChangeListener3 = onFocusChangeListener;
                    if (onFocusChangeListener3 != null) {
                        onFocusChangeListener3.onFocusChange(view, z);
                    }
                    String strDd00640064006400640064 = NavigationListener.this.dd00640064006400640064(view);
                    if (z) {
                        navigationListener = NavigationListener.this;
                        strPppp0070ppp = uuxuuuu.pp0070p0070ppp("V", (char) (yylylll.r0072r0072r00720072() ^ (-1349847246)), (char) (yyyllll.rrrr007200720072() ^ 383821938), (char) (yyyllll.rrrr007200720072() ^ 383821866));
                        int i = h00680068h00680068h0068;
                        if (((h0068h006800680068h0068 + i) * i) % hh0068006800680068h0068 != hhh006800680068h0068) {
                            h00680068h00680068h0068 = h00680068006800680068h0068();
                            hhh006800680068h0068 = 56;
                        }
                    } else {
                        navigationListener = NavigationListener.this;
                        strPppp0070ppp = uuxuuuu.pppp0070ppp("F", (char) (ylyylll.r0072rrr00720072() ^ (-1691741394)), (char) (yyyllll.rrrr007200720072() ^ 383821867));
                    }
                    navigationListener.dd0064d006400640064(strPppp0070ppp, SystemClock.uptimeMillis() - NavigationListener.d006400640064d00640064(NavigationListener.this), strDd00640064006400640064);
                }
            };
            int i = hhh0068h0068h0068;
            if (((hh00680068h0068h0068 + i) * i) % h006800680068h0068h0068 != h0068h0068h0068h0068) {
                hhh0068h0068h0068 = 94;
                h0068h0068h0068h0068 = 56;
            }
            editText.setOnFocusChangeListener(onFocusChangeListener2);
        }
    }

    private List<EditText> d0064d0064006400640064(@NonNull ViewGroup viewGroup) {
        ArrayList arrayList = new ArrayList();
        if (this.xxx0078x00780078) {
            viewGroup.setOnHierarchyChangeListener(this);
        }
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            int i2 = hhh0068h0068h0068;
            if (((hh00680068h0068h0068 + i2) * i2) % h006800680068h0068h0068 != h0068h0068h0068h0068) {
                hhh0068h0068h0068 = 58;
                h0068h0068h0068h0068 = hhhh00680068h0068();
            }
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                arrayList.addAll(d0064d0064006400640064((ViewGroup) childAt));
            } else if (childAt instanceof EditText) {
                arrayList.add((EditText) childAt);
            }
        }
        return arrayList;
    }

    private void d0064dd006400640064(String str, long j, long j2) {
        this.x00780078xx00780078.put(new JSONArray().put(str).put(j).put(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String dd00640064006400640064(View view) {
        if (!(view instanceof EditText)) {
            return "";
        }
        BehavioButtonTouchListener behavioButtonTouchListener = this.x0078x0078x00780078;
        int i = hhh0068h0068h0068;
        if (((hh00680068h0068h0068 + i) * i) % h006800680068h0068h0068 != h0068h0068h0068h0068) {
            hhh0068h0068h0068 = hhhh00680068h0068();
            h0068h0068h0068h0068 = 58;
        }
        if (behavioButtonTouchListener != null) {
            EditText editText = (EditText) view;
            if (this.x0078x0078x00780078.n006Ennnn006E(editText) != null) {
                return this.x0078x0078x00780078.n006Ennnn006E(editText);
            }
        }
        return ((EditText) view).toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dd0064d006400640064(String str, long j, String str2) {
        SyncedJSONArray syncedJSONArray = this.x00780078xx00780078;
        JSONArray jSONArray = new JSONArray();
        int i = hhh0068h0068h0068;
        if (((hh00680068h0068h0068 + i) * i) % h006800680068h0068h0068 != 0) {
            hhh0068h0068h0068 = 33;
            h0068h0068h0068h0068 = hhhh00680068h0068();
        }
        syncedJSONArray.put(jSONArray.put(str).put(j).put(str2));
    }

    public static int h0068hh00680068h0068() {
        return 2;
    }

    public static int hh0068h00680068h0068() {
        return 1;
    }

    public static int hhhh00680068h0068() {
        return 43;
    }

    public void b00620062bbbb() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        String strPp0070p0070ppp = uuxuuuu.pp0070p0070ppp("\u000b", (char) (yllylll.r007200720072r00720072() ^ (-1146716898)), (char) (yyyllll.rrrr007200720072() ^ 383821925), (char) (yylylll.r0072r0072r00720072() ^ (-1349847051)));
        if ((hhhh00680068h0068() * (hhhh00680068h0068() + hh00680068h0068h0068)) % h006800680068h0068h0068 != h0068h0068h0068h0068) {
            hhh0068h0068h0068 = hhhh00680068h0068();
            h0068h0068h0068h0068 = hhhh00680068h0068();
        }
        d0064dd006400640064(strPp0070p0070ppp, jUptimeMillis - this.xx0078xx00780078, jUptimeMillis);
    }

    public void b0062bbbbb() {
        long jUptimeMillis = SystemClock.uptimeMillis();
        d0064dd006400640064(uuxuuuu.pppp0070ppp("?", (char) (yylylll.r0072r0072r00720072() ^ (-1349847243)), (char) (yllylll.r007200720072r00720072() ^ (-1146716788))), jUptimeMillis - this.xx0078xx00780078, jUptimeMillis);
    }

    public JSONArray bb0062bbbb() {
        return this.x00780078xx00780078.getJSONArray();
    }

    public void ddd0064006400640064() {
        int i = hhh0068h0068h0068;
        if (((hh00680068h0068h0068 + i) * i) % h006800680068h0068h0068 != 0) {
            hhh0068h0068h0068 = 53;
            h0068h0068h0068h0068 = 66;
        }
        this.x00780078xx00780078.clear();
        this.xx0078xx00780078 = SystemClock.uptimeMillis();
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewAdded(View view, View view2) {
        ArrayList arrayList = new ArrayList();
        if (view2 instanceof ViewGroup) {
            arrayList.addAll(d0064d0064006400640064((ViewGroup) view2));
        } else if (view2 instanceof EditText) {
            arrayList.add((EditText) view2);
        }
        d00640064d006400640064(arrayList);
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public void onChildViewRemoved(View view, View view2) {
    }

    public void setBehavioButtonTouchListener(BehavioButtonTouchListener behavioButtonTouchListener) {
        this.x0078x0078x00780078 = behavioButtonTouchListener;
        while (true) {
            try {
                int[] iArr = new int[-1];
            } catch (Exception unused) {
                return;
            }
        }
    }

    public NavigationListener(@NonNull ViewGroup viewGroup, boolean z) {
        this.x0078x0078x00780078 = null;
        this.xxx0078x00780078 = z;
        this.xx0078xx00780078 = SystemClock.uptimeMillis();
        this.x00780078xx00780078 = new SyncedJSONArray();
        d0064dd006400640064(uuxuuuu.pp0070p0070ppp("C", (char) (yllylll.r007200720072r00720072() ^ (-1146716818)), (char) (yylylll.r0072r0072r00720072() ^ (-1349847202)), (char) (ylyylll.r0072rrr00720072() ^ (-1691741333))), 0L, this.xx0078xx00780078);
        d00640064d006400640064(d0064d0064006400640064(viewGroup));
    }
}
