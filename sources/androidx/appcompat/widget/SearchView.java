package androidx.appcompat.widget;

import android.R;
import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.CollapsibleActionView;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.view.ViewCompat;
import androidx.cursoradapter.widget.CursorAdapter;
import androidx.customview.view.AbsSavedState;
import com.dynatrace.android.callback.Callback;
import com.google.android.gms.actions.SearchIntents;
import com.medallia.digital.mobilesdk.q2;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.bouncycastle.asn1.BERTags;

/* loaded from: classes2.dex */
public class SearchView extends LinearLayoutCompat implements CollapsibleActionView {
    public static final PreQAutoCompleteTextViewReflector p0;
    public final View A;
    public UpdatableTouchDelegate B;
    public final Rect C;
    public final Rect D;
    public final int[] E;
    public final int[] F;
    public final ImageView G;
    public final Drawable H;
    public final int I;
    public final int J;
    public final Intent K;
    public final Intent L;
    public final CharSequence M;
    public OnQueryTextListener N;
    public OnCloseListener O;
    public View.OnFocusChangeListener P;
    public OnSuggestionListener Q;
    public View.OnClickListener R;
    public boolean S;
    public boolean T;
    public CursorAdapter U;
    public boolean V;
    public CharSequence W;
    public boolean a0;
    public boolean b0;
    public int c0;
    public boolean d0;
    public String e0;
    public CharSequence f0;
    public boolean g0;
    public int h0;
    public SearchableInfo i0;
    public Bundle j0;
    public final Runnable k0;
    public final Runnable l0;
    public final WeakHashMap m0;
    public final View.OnClickListener n0;
    public final TextWatcher o0;
    public final SearchAutoComplete s;
    public final View t;
    public final View u;
    public final View v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;
    public final ImageView z;

    @RequiresApi
    public static class Api29Impl {
        @DoNotInline
        public static void a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        @DoNotInline
        public static void b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* renamed from: a, reason: collision with root package name */
        public int f183a;
        public int b;
        public int c;
        public int d;

        public final void mapProperties(PropertyMapper propertyMapper) {
            this.f183a = propertyMapper.mapInt("imeOptions", R.attr.imeOptions);
            this.b = propertyMapper.mapInt("maxWidth", R.attr.maxWidth);
            this.c = propertyMapper.mapBoolean("iconifiedByDefault", com.woolworths.R.attr.iconifiedByDefault);
            this.d = propertyMapper.mapObject("queryHint", com.woolworths.R.attr.queryHint);
        }

        public final void readProperties(Object obj, PropertyReader propertyReader) {
            SearchView searchView = (SearchView) obj;
            propertyReader.readInt(this.f183a, searchView.getImeOptions());
            propertyReader.readInt(this.b, searchView.getMaxWidth());
            propertyReader.readBoolean(this.c, searchView.S);
            propertyReader.readObject(this.d, searchView.getQueryHint());
        }
    }

    public interface OnCloseListener {
        void onClose();
    }

    public interface OnQueryTextListener {
        boolean onQueryTextChange(String str);

        boolean onQueryTextSubmit(String str);
    }

    public interface OnSuggestionListener {
        void onSuggestionClick(int i);
    }

    public static class PreQAutoCompleteTextViewReflector {

        /* renamed from: a, reason: collision with root package name */
        public Method f184a;
        public Method b;
        public Method c;

        public static void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AnonymousClass1();
        public boolean f;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$1, reason: invalid class name */
        public class AnonymousClass1 implements Parcelable.ClassLoaderCreator<SavedState> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SearchView.SavedState{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" isIconified=");
            return YU.a.k("}", sb, this.f);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f));
        }
    }

    @RestrictTo
    public static class SearchAutoComplete extends AppCompatAutoCompleteTextView {
        public int h;
        public SearchView i;
        public boolean j;
        public final Runnable k;

        public SearchAutoComplete(Context context) {
            this(context, null);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i >= 600) {
                return BERTags.PRIVATE;
            }
            if (i < 640 || i2 < 480) {
                return 160;
            }
            return BERTags.PRIVATE;
        }

        public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            if (Build.VERSION.SDK_INT >= 29) {
                Api29Impl.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = SearchView.p0;
            preQAutoCompleteTextViewReflector.getClass();
            PreQAutoCompleteTextViewReflector.a();
            Method method = preQAutoCompleteTextViewReflector.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            return this.h <= 0 || super.enoughToFilter();
        }

        @Override // androidx.appcompat.widget.AppCompatAutoCompleteTextView, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.j) {
                Runnable runnable = this.k;
                removeCallbacks(runnable);
                post(runnable);
            }
            return inputConnectionOnCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.i;
            searchView.y(searchView.T);
            searchView.post(searchView.k0);
            if (searchView.s.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            super.onWindowFocusChanged(z);
            if (z && this.i.hasFocus() && getVisibility() == 0) {
                this.j = true;
                Context context = getContext();
                PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = SearchView.p0;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            Runnable runnable = this.k;
            if (!z) {
                this.j = false;
                removeCallbacks(runnable);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (!inputMethodManager.isActive(this)) {
                    this.j = true;
                    return;
                }
                this.j = false;
                removeCallbacks(runnable);
                inputMethodManager.showSoftInput(this, 0);
            }
        }

        public void setSearchView(SearchView searchView) {
            this.i = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.h = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, com.woolworths.R.attr.autoCompleteTextViewStyle);
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.k = new Runnable() { // from class: androidx.appcompat.widget.SearchView.SearchAutoComplete.1
                @Override // java.lang.Runnable
                public final void run() {
                    SearchAutoComplete searchAutoComplete = SearchAutoComplete.this;
                    if (searchAutoComplete.j) {
                        ((InputMethodManager) searchAutoComplete.getContext().getSystemService("input_method")).showSoftInput(searchAutoComplete, 0);
                        searchAutoComplete.j = false;
                    }
                }
            };
            this.h = getThreshold();
        }
    }

    public static class UpdatableTouchDelegate extends TouchDelegate {

        /* renamed from: a, reason: collision with root package name */
        public final View f185a;
        public final Rect b;
        public final Rect c;
        public final Rect d;
        public final int e;
        public boolean f;

        public UpdatableTouchDelegate(View view, Rect rect, Rect rect2) {
            super(rect, view);
            int scaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            this.e = scaledTouchSlop;
            Rect rect3 = new Rect();
            this.b = rect3;
            Rect rect4 = new Rect();
            this.d = rect4;
            Rect rect5 = new Rect();
            this.c = rect5;
            rect3.set(rect);
            rect4.set(rect);
            int i = -scaledTouchSlop;
            rect4.inset(i, i);
            rect5.set(rect2);
            this.f185a = view;
        }

        @Override // android.view.TouchDelegate
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            boolean z;
            boolean z2;
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            int action = motionEvent.getAction();
            boolean z3 = true;
            if (action != 0) {
                if (action == 1 || action == 2) {
                    z2 = this.f;
                    if (z2 && !this.d.contains(x, y)) {
                        z3 = z2;
                        z = false;
                    }
                } else {
                    if (action == 3) {
                        z2 = this.f;
                        this.f = false;
                    }
                    z = true;
                    z3 = false;
                }
                z3 = z2;
                z = true;
            } else if (this.b.contains(x, y)) {
                this.f = true;
                z = true;
            } else {
                z = true;
                z3 = false;
            }
            if (!z3) {
                return false;
            }
            Rect rect = this.c;
            View view = this.f185a;
            if (!z || rect.contains(x, y)) {
                motionEvent.setLocation(x - rect.left, y - rect.top);
            } else {
                motionEvent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            }
            return view.dispatchTouchEvent(motionEvent);
        }
    }

    static {
        PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = null;
        if (Build.VERSION.SDK_INT < 29) {
            PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector2 = new PreQAutoCompleteTextViewReflector();
            preQAutoCompleteTextViewReflector2.f184a = null;
            preQAutoCompleteTextViewReflector2.b = null;
            preQAutoCompleteTextViewReflector2.c = null;
            PreQAutoCompleteTextViewReflector.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                preQAutoCompleteTextViewReflector2.f184a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                preQAutoCompleteTextViewReflector2.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                preQAutoCompleteTextViewReflector2.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            preQAutoCompleteTextViewReflector = preQAutoCompleteTextViewReflector2;
        }
        p0 = preQAutoCompleteTextViewReflector;
    }

    public SearchView(@NonNull Context context) {
        this(context, null);
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(com.woolworths.R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(com.woolworths.R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        SearchAutoComplete searchAutoComplete = this.s;
        searchAutoComplete.setText(charSequence);
        searchAutoComplete.setSelection(TextUtils.isEmpty(charSequence) ? 0 : charSequence.length());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.b0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.s;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.b0 = false;
    }

    public int getImeOptions() {
        return this.s.getImeOptions();
    }

    public int getInputType() {
        return this.s.getInputType();
    }

    public int getMaxWidth() {
        return this.c0;
    }

    public CharSequence getQuery() {
        return this.s.getText();
    }

    @Nullable
    public CharSequence getQueryHint() {
        CharSequence charSequence = this.W;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.i0;
        return (searchableInfo == null || searchableInfo.getHintId() == 0) ? this.M : getContext().getText(this.i0.getHintId());
    }

    public int getSuggestionCommitIconResId() {
        return this.J;
    }

    public int getSuggestionRowLayout() {
        return this.I;
    }

    public CursorAdapter getSuggestionsAdapter() {
        return this.U;
    }

    public final Intent j(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f0);
        if (str3 != null) {
            intent.putExtra(SearchIntents.EXTRA_QUERY, str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.j0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.i0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.j0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        String string = searchableInfo.getVoiceLanguageModeId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageModeId()) : "free_form";
        String string2 = searchableInfo.getVoicePromptTextId() != 0 ? resources.getString(searchableInfo.getVoicePromptTextId()) : null;
        String string3 = searchableInfo.getVoiceLanguageId() != 0 ? resources.getString(searchableInfo.getVoiceLanguageId()) : null;
        int voiceMaxResults = searchableInfo.getVoiceMaxResults() != 0 ? searchableInfo.getVoiceMaxResults() : 1;
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", string);
        intent3.putExtra("android.speech.extra.PROMPT", string2);
        intent3.putExtra("android.speech.extra.LANGUAGE", string3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", voiceMaxResults);
        intent3.putExtra("calling_package", searchActivity != null ? searchActivity.flattenToShortString() : null);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.s;
        if (i >= 29) {
            Api29Impl.a(searchAutoComplete);
            return;
        }
        PreQAutoCompleteTextViewReflector preQAutoCompleteTextViewReflector = p0;
        preQAutoCompleteTextViewReflector.getClass();
        PreQAutoCompleteTextViewReflector.a();
        Method method = preQAutoCompleteTextViewReflector.f184a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        preQAutoCompleteTextViewReflector.getClass();
        PreQAutoCompleteTextViewReflector.a();
        Method method2 = preQAutoCompleteTextViewReflector.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.s;
        if (!TextUtils.isEmpty(searchAutoComplete.getText())) {
            searchAutoComplete.setText("");
            searchAutoComplete.requestFocus();
            searchAutoComplete.setImeVisibility(true);
        } else if (this.S) {
            OnCloseListener onCloseListener = this.O;
            if (onCloseListener != null) {
                onCloseListener.onClose();
            }
            clearFocus();
            y(true);
        }
    }

    public final boolean n(int i) {
        int position;
        String strL;
        OnSuggestionListener onSuggestionListener = this.Q;
        if (onSuggestionListener != null) {
            onSuggestionListener.onSuggestionClick(i);
        }
        Cursor cursor = this.U.f;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intentJ = null;
            try {
                int i2 = SuggestionsAdapter.B;
                String strL2 = SuggestionsAdapter.l(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (strL2 == null) {
                    strL2 = this.i0.getSuggestIntentAction();
                }
                if (strL2 == null) {
                    strL2 = "android.intent.action.SEARCH";
                }
                String strL3 = SuggestionsAdapter.l(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (strL3 == null) {
                    strL3 = this.i0.getSuggestIntentData();
                }
                if (strL3 != null && (strL = SuggestionsAdapter.l(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    strL3 = strL3 + q2.c + Uri.encode(strL);
                }
                intentJ = j(strL3 == null ? null : Uri.parse(strL3), strL2, SuggestionsAdapter.l(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), SuggestionsAdapter.l(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    position = cursor.getPosition();
                } catch (RuntimeException unused) {
                    position = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + position + " returned exception.", e);
            }
            if (intentJ != null) {
                try {
                    getContext().startActivity(intentJ);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intentJ, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.s;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
        return true;
    }

    public final void o(int i) {
        Editable text = this.s.getText();
        Cursor cursor = this.U.f;
        if (cursor == null) {
            return;
        }
        if (!cursor.moveToPosition(i)) {
            setQuery(text);
            return;
        }
        String strConvertToString = this.U.convertToString(cursor);
        if (strConvertToString != null) {
            setQuery(strConvertToString);
        } else {
            setQuery(text);
        }
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewCollapsed() {
        s("", false);
        clearFocus();
        y(true);
        this.s.setImeOptions(this.h0);
        this.g0 = false;
    }

    @Override // androidx.appcompat.view.CollapsibleActionView
    public final void onActionViewExpanded() {
        if (this.g0) {
            return;
        }
        this.g0 = true;
        SearchAutoComplete searchAutoComplete = this.s;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.h0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.k0);
        post(this.l0);
        super.onDetachedFromWindow();
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.s;
            int[] iArr = this.E;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.F;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.C;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.D;
            rect2.set(i7, 0, i8, i9);
            UpdatableTouchDelegate updatableTouchDelegate = this.B;
            if (updatableTouchDelegate == null) {
                UpdatableTouchDelegate updatableTouchDelegate2 = new UpdatableTouchDelegate(searchAutoComplete, rect2, rect);
                this.B = updatableTouchDelegate2;
                setTouchDelegate(updatableTouchDelegate2);
            } else {
                updatableTouchDelegate.b.set(rect2);
                Rect rect3 = updatableTouchDelegate.d;
                rect3.set(rect2);
                int i10 = -updatableTouchDelegate.e;
                rect3.inset(i10, i10);
                updatableTouchDelegate.c.set(rect);
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.T) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.c0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.c0;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.c0) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.d);
        y(savedState.f);
        requestLayout();
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f = this.T;
        return savedState;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.k0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.s;
        Editable text = searchAutoComplete.getText();
        if (text == null || TextUtils.getTrimmedLength(text) <= 0) {
            return;
        }
        OnQueryTextListener onQueryTextListener = this.N;
        if (onQueryTextListener == null || !onQueryTextListener.onQueryTextSubmit(text.toString())) {
            if (this.i0 != null) {
                getContext().startActivity(j(null, "android.intent.action.SEARCH", null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        SearchableInfo searchableInfo = this.i0;
        if (searchableInfo == null) {
            return;
        }
        try {
            if (!searchableInfo.getVoiceSearchLaunchWebSearch()) {
                if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(k(this.L, searchableInfo));
                }
            } else {
                Intent intent = new Intent(this.K);
                ComponentName searchActivity = searchableInfo.getSearchActivity();
                intent.putExtra("calling_package", searchActivity == null ? null : searchActivity.flattenToShortString());
                getContext().startActivity(intent);
            }
        } catch (ActivityNotFoundException unused) {
            Log.w("SearchView", "Could not find voice search activity");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.b0 || !isFocusable()) {
            return false;
        }
        if (this.T) {
            return super.requestFocus(i, rect);
        }
        boolean zRequestFocus = this.s.requestFocus(i, rect);
        if (zRequestFocus) {
            y(false);
        }
        return zRequestFocus;
    }

    public final void s(CharSequence charSequence, boolean z) {
        SearchAutoComplete searchAutoComplete = this.s;
        searchAutoComplete.setText(charSequence);
        if (charSequence != null) {
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f0 = charSequence;
        }
        if (!z || TextUtils.isEmpty(charSequence)) {
            return;
        }
        q();
    }

    @RestrictTo
    public void setAppSearchData(Bundle bundle) {
        this.j0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        y(false);
        SearchAutoComplete searchAutoComplete = this.s;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.R;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.S == z) {
            return;
        }
        this.S = z;
        y(z);
        v();
    }

    public void setImeOptions(int i) {
        this.s.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.s.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.c0 = i;
        requestLayout();
    }

    public void setOnCloseListener(OnCloseListener onCloseListener) {
        this.O = onCloseListener;
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.P = onFocusChangeListener;
    }

    public void setOnQueryTextListener(OnQueryTextListener onQueryTextListener) {
        this.N = onQueryTextListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.R = onClickListener;
    }

    public void setOnSuggestionListener(OnSuggestionListener onSuggestionListener) {
        this.Q = onSuggestionListener;
    }

    public void setQueryHint(@Nullable CharSequence charSequence) {
        this.W = charSequence;
        v();
    }

    public void setQueryRefinementEnabled(boolean z) {
        this.a0 = z;
        CursorAdapter cursorAdapter = this.U;
        if (cursorAdapter instanceof SuggestionsAdapter) {
            ((SuggestionsAdapter) cursorAdapter).t = z ? 2 : 1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.i0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.s
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.i0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.i0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.i0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            androidx.cursoradapter.widget.CursorAdapter r7 = r6.U
            if (r7 == 0) goto L3b
            r7.a(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.i0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            androidx.appcompat.widget.SuggestionsAdapter r7 = new androidx.appcompat.widget.SuggestionsAdapter
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.i0
            java.util.WeakHashMap r5 = r6.m0
            r7.<init>(r3, r6, r4, r5)
            r6.U = r7
            r2.setAdapter(r7)
            androidx.cursoradapter.widget.CursorAdapter r7 = r6.U
            androidx.appcompat.widget.SuggestionsAdapter r7 = (androidx.appcompat.widget.SuggestionsAdapter) r7
            boolean r3 = r6.a0
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.t = r3
        L62:
            r6.v()
        L65:
            android.app.SearchableInfo r7 = r6.i0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.i0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.K
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.i0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.L
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.18355E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.d0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.T
            r6.y(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.V = z;
        y(this.T);
    }

    public void setSuggestionsAdapter(CursorAdapter cursorAdapter) {
        this.U = cursorAdapter;
        this.s.setAdapter(cursorAdapter);
    }

    public final void t() {
        boolean zIsEmpty = TextUtils.isEmpty(this.s.getText());
        int i = (!zIsEmpty || (this.S && !this.g0)) ? 0 : 8;
        ImageView imageView = this.y;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            drawable.setState(!zIsEmpty ? ViewGroup.ENABLED_STATE_SET : ViewGroup.EMPTY_STATE_SET);
        }
    }

    public final void u() {
        int[] iArr = this.s.hasFocus() ? ViewGroup.FOCUSED_STATE_SET : ViewGroup.EMPTY_STATE_SET;
        Drawable background = this.u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public final void v() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.S;
        SearchAutoComplete searchAutoComplete = this.s;
        if (z && (drawable = this.H) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void w() {
        this.v.setVisibility(((this.V || this.d0) && !this.T && (this.x.getVisibility() == 0 || this.z.getVisibility() == 0)) ? 0 : 8);
    }

    public final void x(boolean z) {
        boolean z2 = this.V;
        this.x.setVisibility((!z2 || !(z2 || this.d0) || this.T || !hasFocus() || (!z && this.d0)) ? 8 : 0);
    }

    public final void y(boolean z) {
        this.T = z;
        int i = 8;
        int i2 = z ? 0 : 8;
        boolean zIsEmpty = TextUtils.isEmpty(this.s.getText());
        this.w.setVisibility(i2);
        x(!zIsEmpty);
        this.t.setVisibility(z ? 8 : 0);
        ImageView imageView = this.G;
        imageView.setVisibility((imageView.getDrawable() == null || this.S) ? 8 : 0);
        t();
        if (this.d0 && !this.T && zIsEmpty) {
            this.x.setVisibility(8);
            i = 0;
        }
        this.z.setVisibility(i);
        w();
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.woolworths.R.attr.searchViewStyle);
    }

    public SearchView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.C = new Rect();
        this.D = new Rect();
        this.E = new int[2];
        this.F = new int[2];
        this.k0 = new Runnable() { // from class: androidx.appcompat.widget.SearchView.1
            @Override // java.lang.Runnable
            public final void run() {
                SearchView.this.u();
            }
        };
        this.l0 = new Runnable() { // from class: androidx.appcompat.widget.SearchView.2
            @Override // java.lang.Runnable
            public final void run() {
                CursorAdapter cursorAdapter = SearchView.this.U;
                if (cursorAdapter instanceof SuggestionsAdapter) {
                    cursorAdapter.a(null);
                }
            }
        };
        this.m0 = new WeakHashMap();
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: androidx.appcompat.widget.SearchView.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Callback.g(view);
                try {
                    SearchView searchView = SearchView.this;
                    SearchAutoComplete searchAutoComplete = searchView.s;
                    if (view == searchView.w) {
                        searchView.y(false);
                        searchAutoComplete.requestFocus();
                        searchAutoComplete.setImeVisibility(true);
                        View.OnClickListener onClickListener2 = searchView.R;
                        if (onClickListener2 != null) {
                            onClickListener2.onClick(searchView);
                        }
                    } else if (view == searchView.y) {
                        searchView.m();
                    } else if (view == searchView.x) {
                        searchView.q();
                    } else if (view == searchView.z) {
                        searchView.r();
                    } else if (view == searchAutoComplete) {
                        searchView.l();
                    }
                    Callback.h();
                } catch (Throwable th) {
                    Callback.h();
                    throw th;
                }
            }
        };
        this.n0 = onClickListener;
        View.OnKeyListener onKeyListener = new View.OnKeyListener() { // from class: androidx.appcompat.widget.SearchView.6
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i2, KeyEvent keyEvent) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
                SearchView searchView = SearchView.this;
                SearchAutoComplete searchAutoComplete = searchView.s;
                if (searchView.i0 != null) {
                    if (!searchAutoComplete.isPopupShowing() || searchAutoComplete.getListSelection() == -1) {
                        if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i2 == 66) {
                            view.cancelLongPress();
                            searchView.getContext().startActivity(searchView.j(null, "android.intent.action.SEARCH", null, searchAutoComplete.getText().toString()));
                            return true;
                        }
                    } else if (searchView.i0 != null && searchView.U != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                        if (i2 == 66 || i2 == 84 || i2 == 61) {
                            searchView.n(searchAutoComplete.getListSelection());
                            return true;
                        }
                        if (i2 == 21 || i2 == 22) {
                            searchAutoComplete.setSelection(i2 == 21 ? 0 : searchAutoComplete.length());
                            searchAutoComplete.setListSelection(0);
                            searchAutoComplete.clearListSelection();
                            searchAutoComplete.a();
                            return true;
                        }
                        if (i2 == 19) {
                            searchAutoComplete.getListSelection();
                            return false;
                        }
                    }
                }
                return false;
            }
        };
        TextView.OnEditorActionListener onEditorActionListener = new TextView.OnEditorActionListener() { // from class: androidx.appcompat.widget.SearchView.7
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i2, KeyEvent keyEvent) {
                SearchView.this.q();
                return true;
            }
        };
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() { // from class: androidx.appcompat.widget.SearchView.8
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i2, long j) {
                Callback.j(view);
                try {
                    SearchView.this.n(i2);
                } finally {
                    Callback.k();
                }
            }
        };
        AdapterView.OnItemSelectedListener onItemSelectedListener = new AdapterView.OnItemSelectedListener() { // from class: androidx.appcompat.widget.SearchView.9
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView adapterView, View view, int i2, long j) {
                Callback.l(view);
                try {
                    SearchView.this.o(i2);
                } finally {
                    Callback.m();
                }
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView adapterView) {
            }
        };
        TextWatcher textWatcher = new TextWatcher() { // from class: androidx.appcompat.widget.SearchView.10
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                SearchView searchView = SearchView.this;
                Editable text = searchView.s.getText();
                searchView.f0 = text;
                boolean zIsEmpty = TextUtils.isEmpty(text);
                searchView.x(!zIsEmpty);
                int i5 = 8;
                if (searchView.d0 && !searchView.T && zIsEmpty) {
                    searchView.x.setVisibility(8);
                    i5 = 0;
                }
                searchView.z.setVisibility(i5);
                searchView.t();
                searchView.w();
                if (searchView.N != null && !TextUtils.equals(charSequence, searchView.e0)) {
                    searchView.N.onQueryTextChange(charSequence.toString());
                }
                searchView.e0 = charSequence.toString();
            }
        };
        this.o0 = textWatcher;
        int[] iArr = androidx.appcompat.R.styleable.w;
        TintTypedArray tintTypedArrayF = TintTypedArray.f(context, attributeSet, iArr, i, 0);
        ViewCompat.z(this, context, iArr, attributeSet, tintTypedArrayF.b, i);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        TypedArray typedArray = tintTypedArrayF.b;
        layoutInflaterFrom.inflate(typedArray.getResourceId(19, com.woolworths.R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(com.woolworths.R.id.search_src_text);
        this.s = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.t = findViewById(com.woolworths.R.id.search_edit_frame);
        View viewFindViewById = findViewById(com.woolworths.R.id.search_plate);
        this.u = viewFindViewById;
        View viewFindViewById2 = findViewById(com.woolworths.R.id.submit_area);
        this.v = viewFindViewById2;
        ImageView imageView = (ImageView) findViewById(com.woolworths.R.id.search_button);
        this.w = imageView;
        ImageView imageView2 = (ImageView) findViewById(com.woolworths.R.id.search_go_btn);
        this.x = imageView2;
        ImageView imageView3 = (ImageView) findViewById(com.woolworths.R.id.search_close_btn);
        this.y = imageView3;
        ImageView imageView4 = (ImageView) findViewById(com.woolworths.R.id.search_voice_btn);
        this.z = imageView4;
        ImageView imageView5 = (ImageView) findViewById(com.woolworths.R.id.search_mag_icon);
        this.G = imageView5;
        viewFindViewById.setBackground(tintTypedArrayF.b(20));
        viewFindViewById2.setBackground(tintTypedArrayF.b(25));
        imageView.setImageDrawable(tintTypedArrayF.b(23));
        imageView2.setImageDrawable(tintTypedArrayF.b(15));
        imageView3.setImageDrawable(tintTypedArrayF.b(12));
        imageView4.setImageDrawable(tintTypedArrayF.b(28));
        imageView5.setImageDrawable(tintTypedArrayF.b(23));
        this.H = tintTypedArrayF.b(22);
        TooltipCompat.Api26Impl.a(imageView, getResources().getString(com.woolworths.R.string.abc_searchview_description_search));
        this.I = typedArray.getResourceId(26, com.woolworths.R.layout.abc_search_dropdown_item_icons_2line);
        this.J = typedArray.getResourceId(13, 0);
        imageView.setOnClickListener(onClickListener);
        imageView3.setOnClickListener(onClickListener);
        imageView2.setOnClickListener(onClickListener);
        imageView4.setOnClickListener(onClickListener);
        searchAutoComplete.setOnClickListener(onClickListener);
        searchAutoComplete.addTextChangedListener(textWatcher);
        searchAutoComplete.setOnEditorActionListener(onEditorActionListener);
        searchAutoComplete.setOnItemClickListener(onItemClickListener);
        searchAutoComplete.setOnItemSelectedListener(onItemSelectedListener);
        searchAutoComplete.setOnKeyListener(onKeyListener);
        searchAutoComplete.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: androidx.appcompat.widget.SearchView.3
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                SearchView searchView = SearchView.this;
                View.OnFocusChangeListener onFocusChangeListener = searchView.P;
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(searchView, z);
                }
            }
        });
        setIconifiedByDefault(typedArray.getBoolean(18, true));
        int dimensionPixelSize = typedArray.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.M = typedArray.getText(14);
        this.W = typedArray.getText(21);
        int i2 = typedArray.getInt(6, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i3 = typedArray.getInt(5, -1);
        if (i3 != -1) {
            setInputType(i3);
        }
        setFocusable(typedArray.getBoolean(1, true));
        tintTypedArrayF.g();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.K = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.L = intent2;
        intent2.addFlags(268435456);
        View viewFindViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.A = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: androidx.appcompat.widget.SearchView.4
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
                    SearchView searchView = SearchView.this;
                    SearchAutoComplete searchAutoComplete2 = searchView.s;
                    View view2 = searchView.A;
                    if (view2.getWidth() > 1) {
                        Resources resources = searchView.getContext().getResources();
                        int paddingLeft = searchView.u.getPaddingLeft();
                        Rect rect = new Rect();
                        boolean z = searchView.getLayoutDirection() == 1;
                        int dimensionPixelSize2 = searchView.S ? resources.getDimensionPixelSize(com.woolworths.R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(com.woolworths.R.dimen.abc_dropdownitem_icon_width) : 0;
                        searchAutoComplete2.getDropDownBackground().getPadding(rect);
                        searchAutoComplete2.setDropDownHorizontalOffset(z ? -rect.left : paddingLeft - (rect.left + dimensionPixelSize2));
                        searchAutoComplete2.setDropDownWidth((((view2.getWidth() + rect.left) + rect.right) + dimensionPixelSize2) - paddingLeft);
                    }
                }
            });
        }
        y(this.S);
        v();
    }
}
