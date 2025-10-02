package androidx.preference;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.preference.DialogPreference;

@Deprecated
/* loaded from: classes2.dex */
public abstract class PreferenceDialogFragment extends DialogFragment implements DialogInterface.OnClickListener {
    public DialogPreference d;
    public CharSequence e;
    public CharSequence f;
    public CharSequence g;
    public CharSequence h;
    public int i;
    public BitmapDrawable j;
    public int k;

    @RequiresApi
    public static class Api30Impl {
        @DoNotInline
        public static void a(@NonNull Window window) {
            window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
        }
    }

    public final DialogPreference a() {
        if (this.d == null) {
            this.d = (DialogPreference) ((DialogPreference.TargetFragment) getTargetFragment()).C(getArguments().getString("key"));
        }
        return this.d;
    }

    public void b(View view) {
        int i;
        View viewFindViewById = view.findViewById(android.R.id.message);
        if (viewFindViewById != null) {
            CharSequence charSequence = this.h;
            if (TextUtils.isEmpty(charSequence)) {
                i = 8;
            } else {
                if (viewFindViewById instanceof TextView) {
                    ((TextView) viewFindViewById).setText(charSequence);
                }
                i = 0;
            }
            if (viewFindViewById.getVisibility() != i) {
                viewFindViewById.setVisibility(i);
            }
        }
    }

    public abstract void c(boolean z);

    public void d(AlertDialog.Builder builder) {
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.k = i;
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ComponentCallbacks2 targetFragment = getTargetFragment();
        if (!(targetFragment instanceof DialogPreference.TargetFragment)) {
            throw new IllegalStateException("Target fragment must implement TargetFragment interface");
        }
        DialogPreference.TargetFragment targetFragment2 = (DialogPreference.TargetFragment) targetFragment;
        String string = getArguments().getString("key");
        if (bundle != null) {
            this.e = bundle.getCharSequence("PreferenceDialogFragment.title");
            this.f = bundle.getCharSequence("PreferenceDialogFragment.positiveText");
            this.g = bundle.getCharSequence("PreferenceDialogFragment.negativeText");
            this.h = bundle.getCharSequence("PreferenceDialogFragment.message");
            this.i = bundle.getInt("PreferenceDialogFragment.layout", 0);
            Bitmap bitmap = (Bitmap) bundle.getParcelable("PreferenceDialogFragment.icon");
            if (bitmap != null) {
                this.j = new BitmapDrawable(getResources(), bitmap);
                return;
            }
            return;
        }
        DialogPreference dialogPreference = (DialogPreference) targetFragment2.C(string);
        this.d = dialogPreference;
        this.e = dialogPreference.P;
        this.f = dialogPreference.S;
        this.g = dialogPreference.T;
        this.h = dialogPreference.Q;
        this.i = dialogPreference.U;
        Drawable drawable = dialogPreference.R;
        if (drawable == null || (drawable instanceof BitmapDrawable)) {
            this.j = (BitmapDrawable) drawable;
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        this.j = new BitmapDrawable(getResources(), bitmapCreateBitmap);
    }

    @Override // android.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Activity activity = getActivity();
        this.k = -2;
        AlertDialog.Builder negativeButton = new AlertDialog.Builder(activity).setTitle(this.e).setIcon(this.j).setPositiveButton(this.f, this).setNegativeButton(this.g, this);
        int i = this.i;
        View viewInflate = i != 0 ? LayoutInflater.from(activity).inflate(i, (ViewGroup) null) : null;
        if (viewInflate != null) {
            b(viewInflate);
            negativeButton.setView(viewInflate);
        } else {
            negativeButton.setMessage(this.h);
        }
        d(negativeButton);
        AlertDialog alertDialogCreate = negativeButton.create();
        if (this instanceof EditTextPreferenceDialogFragment) {
            Window window = alertDialogCreate.getWindow();
            if (Build.VERSION.SDK_INT >= 30) {
                Api30Impl.a(window);
                return alertDialogCreate;
            }
            window.setSoftInputMode(5);
        }
        return alertDialogCreate;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        c(this.k == -1);
    }

    @Override // android.app.DialogFragment, android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putCharSequence("PreferenceDialogFragment.title", this.e);
        bundle.putCharSequence("PreferenceDialogFragment.positiveText", this.f);
        bundle.putCharSequence("PreferenceDialogFragment.negativeText", this.g);
        bundle.putCharSequence("PreferenceDialogFragment.message", this.h);
        bundle.putInt("PreferenceDialogFragment.layout", this.i);
        BitmapDrawable bitmapDrawable = this.j;
        if (bitmapDrawable != null) {
            bundle.putParcelable("PreferenceDialogFragment.icon", bitmapDrawable.getBitmap());
        }
    }
}
