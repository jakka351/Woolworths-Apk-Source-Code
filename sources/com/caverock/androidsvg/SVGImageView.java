package com.caverock.androidsvg;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.drawable.PictureDrawable;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.input.pointer.a;
import com.caverock.androidsvg.CSSParser;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes4.dex */
public class SVGImageView extends ImageView {
    public static final Method f;
    public SVG d;
    public final RenderOptions e;

    public class LoadResourceTask extends AsyncTask<Integer, Integer, SVG> {

        /* renamed from: a, reason: collision with root package name */
        public final Context f14027a;
        public final int b;

        public LoadResourceTask(Context context, int i) {
            this.f14027a = context;
            this.b = i;
        }

        @Override // android.os.AsyncTask
        public final SVG doInBackground(Integer[] numArr) throws Resources.NotFoundException, IOException {
            int i = this.b;
            try {
                Resources resources = this.f14027a.getResources();
                SVGParser sVGParser = new SVGParser();
                InputStream inputStreamOpenRawResource = resources.openRawResource(i);
                try {
                    SVG svgF = sVGParser.f(inputStreamOpenRawResource);
                    try {
                        return svgF;
                    } catch (IOException unused) {
                        return svgF;
                    }
                } finally {
                    try {
                        inputStreamOpenRawResource.close();
                    } catch (IOException unused2) {
                    }
                }
            } catch (SVGParseException e) {
                Log.e("SVGImageView", String.format("Error loading resource 0x%x: %s", Integer.valueOf(i), e.getMessage()));
                return null;
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(SVG svg) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SVGImageView sVGImageView = SVGImageView.this;
            sVGImageView.d = svg;
            sVGImageView.a();
        }
    }

    public class LoadURITask extends AsyncTask<InputStream, Integer, SVG> {
        public LoadURITask() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r3v1, types: [com.caverock.androidsvg.SVGParser] */
        /* JADX WARN: Type inference failed for: r6v1, types: [java.io.InputStream[]] */
        /* JADX WARN: Type inference failed for: r6v2 */
        /* JADX WARN: Type inference failed for: r6v3 */
        /* JADX WARN: Type inference failed for: r6v4, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r6v5 */
        /* JADX WARN: Type inference failed for: r6v6, types: [java.io.InputStream] */
        /* JADX WARN: Type inference failed for: r6v7, types: [java.io.InputStream] */
        @Override // android.os.AsyncTask
        public final SVG doInBackground(InputStream[] inputStreamArr) throws IOException {
            SVG svgF;
            InputStream[] inputStreamArr2 = inputStreamArr;
            try {
                try {
                    svgF = new SVGParser().f(inputStreamArr2[0]);
                } catch (SVGParseException e) {
                    Log.e("SVGImageView", "Parse error loading URI: " + e.getMessage());
                    try {
                        inputStreamArr2 = inputStreamArr2[0];
                        inputStreamArr2.close();
                    } catch (IOException unused) {
                    }
                    svgF = null;
                }
                try {
                    return svgF;
                } catch (IOException unused2) {
                    return svgF;
                }
            } finally {
                try {
                    inputStreamArr2[0].close();
                } catch (IOException unused3) {
                }
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(SVG svg) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            SVGImageView sVGImageView = SVGImageView.this;
            sVGImageView.d = svg;
            sVGImageView.a();
        }
    }

    static {
        try {
            f = View.class.getMethod("setLayerType", Integer.TYPE, Paint.class);
        } catch (NoSuchMethodException unused) {
        }
    }

    public SVGImageView(Context context) {
        super(context);
        this.d = null;
        this.e = new RenderOptions();
    }

    private void setFromString(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        try {
            this.d = SVG.e(str);
            a();
        } catch (SVGParseException unused) {
            a.v("Could not find SVG at: ", str, "SVGImageView");
        }
    }

    public final void a() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        SVG svg = this.d;
        if (svg == null) {
            return;
        }
        Picture pictureH = svg.h(this.e);
        Method method = f;
        if (method != null) {
            try {
                method.invoke(this, Integer.valueOf(View.class.getField("LAYER_TYPE_SOFTWARE").getInt(new View(getContext()))), null);
            } catch (Exception e) {
                Log.w("SVGImageView", "Unexpected failure calling setLayerType", e);
            }
        }
        setImageDrawable(new PictureDrawable(pictureH));
    }

    public final void b(AttributeSet attributeSet, int i) {
        if (isInEditMode()) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(attributeSet, R.styleable.f14009a, i, 0);
        try {
            String string = typedArrayObtainStyledAttributes.getString(0);
            if (string != null) {
                RenderOptions renderOptions = this.e;
                renderOptions.getClass();
                CSSParser cSSParser = new CSSParser(CSSParser.Source.e);
                CSSParser.CSSTextScanner cSSTextScanner = new CSSParser.CSSTextScanner(string);
                cSSTextScanner.q();
                renderOptions.f14010a = cSSParser.e(cSSTextScanner);
            }
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(1, -1);
            if (resourceId != -1) {
                setImageResource(resourceId);
                typedArrayObtainStyledAttributes.recycle();
                return;
            }
            String string2 = typedArrayObtainStyledAttributes.getString(1);
            if (string2 != null) {
                if (d(Uri.parse(string2))) {
                    typedArrayObtainStyledAttributes.recycle();
                    return;
                } else {
                    if (c(string2)) {
                        typedArrayObtainStyledAttributes.recycle();
                        return;
                    }
                    setFromString(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public final boolean c(String str) throws IOException {
        try {
            new LoadURITask().execute(getContext().getAssets().open(str));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean d(Uri uri) throws FileNotFoundException {
        try {
            new LoadURITask().execute(getContext().getContentResolver().openInputStream(uri));
            return true;
        } catch (FileNotFoundException unused) {
            return false;
        }
    }

    public void setCSS(String str) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        RenderOptions renderOptions = this.e;
        renderOptions.getClass();
        CSSParser cSSParser = new CSSParser(CSSParser.Source.e);
        CSSParser.CSSTextScanner cSSTextScanner = new CSSParser.CSSTextScanner(str);
        cSSTextScanner.q();
        renderOptions.f14010a = cSSParser.e(cSSTextScanner);
        a();
    }

    public void setImageAsset(String str) {
        if (c(str)) {
            return;
        }
        a.v("File not found: ", str, "SVGImageView");
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        new LoadResourceTask(getContext(), i).execute(new Integer[0]);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        if (d(uri)) {
            return;
        }
        Log.e("SVGImageView", "File not found: " + uri);
    }

    public void setSVG(SVG svg) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        if (svg == null) {
            throw new IllegalArgumentException("Null value passed to setSVG()");
        }
        this.d = svg;
        a();
    }

    public SVGImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.d = null;
        this.e = new RenderOptions();
        b(attributeSet, 0);
    }

    public SVGImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = null;
        this.e = new RenderOptions();
        b(attributeSet, i);
    }
}
