package com.skydoves.balloon.vectortext;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.skydoves.balloon.R;
import com.skydoves.balloon.extensions.TextViewExtensionKt;
import com.skydoves.balloon.internals.DefinitionKt;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R.\u0010\u0010\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/skydoves/balloon/vectortext/VectorTextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lcom/skydoves/balloon/vectortext/VectorTextViewParams;", "value", "j", "Lcom/skydoves/balloon/vectortext/VectorTextViewParams;", "getDrawableTextViewParams", "()Lcom/skydoves/balloon/vectortext/VectorTextViewParams;", "setDrawableTextViewParams", "(Lcom/skydoves/balloon/vectortext/VectorTextViewParams;)V", "drawableTextViewParams", "balloon_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class VectorTextView extends AppCompatTextView {

    /* renamed from: j, reason: from kotlin metadata */
    public VectorTextViewParams drawableTextViewParams;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VectorTextView(@NotNull Context context) {
        this(context, null);
        Intrinsics.h(context, "context");
    }

    @Nullable
    public final VectorTextViewParams getDrawableTextViewParams() {
        return this.drawableTextViewParams;
    }

    public final void setDrawableTextViewParams(@Nullable VectorTextViewParams vectorTextViewParams) {
        if (vectorTextViewParams != null) {
            TextViewExtensionKt.a(this, vectorTextViewParams);
        } else {
            vectorTextViewParams = null;
        }
        this.drawableTextViewParams = vectorTextViewParams;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public VectorTextView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.h(context, "context");
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f19015a);
            Intrinsics.g(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…styleable.VectorTextView)");
            setDrawableTextViewParams(new VectorTextViewParams(DefinitionKt.a(typedArrayObtainStyledAttributes.getResourceId(5, Integer.MIN_VALUE)), DefinitionKt.a(typedArrayObtainStyledAttributes.getResourceId(1, Integer.MIN_VALUE)), DefinitionKt.a(typedArrayObtainStyledAttributes.getResourceId(0, Integer.MIN_VALUE)), DefinitionKt.a(typedArrayObtainStyledAttributes.getResourceId(7, Integer.MIN_VALUE)), null, null, null, null, DefinitionKt.a(typedArrayObtainStyledAttributes.getResourceId(3, Integer.MIN_VALUE)), DefinitionKt.a(typedArrayObtainStyledAttributes.getColor(6, Integer.MIN_VALUE)), DefinitionKt.a(typedArrayObtainStyledAttributes.getResourceId(8, Integer.MIN_VALUE)), DefinitionKt.a(typedArrayObtainStyledAttributes.getResourceId(2, Integer.MIN_VALUE)), DefinitionKt.a(typedArrayObtainStyledAttributes.getResourceId(4, Integer.MIN_VALUE)), 8176));
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
