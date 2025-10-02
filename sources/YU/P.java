package YU;

import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import java.util.Observable;

/* loaded from: classes2.dex */
public class P extends Observable implements ViewTreeObserver.OnGlobalFocusChangeListener {
    public static int d = 7891;
    public static int e = 6343;

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        int i;
        boolean z = view instanceof EditText;
        if (z) {
            EditText editText = (EditText) view;
            if ((editText.getInputType() & 129) != 129) {
                int inputType = editText.getInputType() & 18;
                if (e <= 6342) {
                    if ((d ^ 7891) == 0) {
                        while (true) {
                            int i2 = e;
                            int i3 = i2 + 26;
                            if (i3 != 47) {
                                if (i3 != 231) {
                                    if (i3 != 281) {
                                        continue;
                                    } else {
                                        e = ((i2 % 18) ^ 3345) * 87;
                                        if (d <= 7890) {
                                            while (true) {
                                                int i4 = d;
                                                int i5 = i4 + 65;
                                                if (i5 != 38) {
                                                    if (i5 != 70) {
                                                        if (i5 == 123) {
                                                            break;
                                                        }
                                                    } else {
                                                        while (true) {
                                                            d = ((d + i4) % 20) ^ 1478;
                                                        }
                                                    }
                                                } else {
                                                    d = (i4 * 49) % 86;
                                                    break;
                                                }
                                            }
                                            d = (d >> 90) % 45;
                                        }
                                    }
                                }
                                e = (e >> 2) + i2;
                                if ((d ^ 7891) != 0) {
                                    break;
                                }
                            } else {
                                while (true) {
                                    e *= 4816;
                                }
                            }
                        }
                    }
                    while (true) {
                        i = d;
                        int i6 = i + 39;
                        if (i6 != 30) {
                            if (i6 == 96) {
                                d = (i % 86) * 77;
                            } else if (i6 != 137) {
                                if (i6 == 191) {
                                    break;
                                }
                            }
                            d = (d >> 92) >> 120;
                        } else {
                            d = ((i >> 78) + i) * 79;
                        }
                    }
                    while (true) {
                        d = ((d * 12) >> 98) + i;
                    }
                } else if (inputType != 18 && (editText.getInputType() & 145) != 145 && (editText.getInputType() & 225) != 225) {
                    String strTrim = editText.getText().toString().trim();
                    if (!strTrim.isEmpty()) {
                        int i7 = 0;
                        int i8 = 0;
                        int i9 = 0;
                        for (char c : strTrim.toCharArray()) {
                            if (Character.isLetter(c)) {
                                i8++;
                            } else if (Character.isDigit(c)) {
                                i9++;
                            } else if (!Character.isWhitespace(c)) {
                                i7++;
                            }
                        }
                        setChanged();
                        int id = editText.getId();
                        String str = M.f12a;
                        notifyObservers(new UO(M.c(String.valueOf(id)), strTrim.length(), i7, i8, i9));
                    }
                }
            }
        }
        if (view2 instanceof EditText) {
            setChanged();
            long jUptimeMillis = SystemClock.uptimeMillis();
            int id2 = view2.getId();
            String str2 = M.f12a;
            notifyObservers(new AU(M.c(String.valueOf(id2)), -1, "1", jUptimeMillis));
        }
        if (z) {
            setChanged();
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            int id3 = view.getId();
            String str3 = M.f12a;
            notifyObservers(new AU(M.c(String.valueOf(id3)), -1, "3", jUptimeMillis2));
        }
    }
}
