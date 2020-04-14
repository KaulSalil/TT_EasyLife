// Generated by data binding compiler. Do not edit!
package com.example.eezylife.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.Bindable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.eezylife.R;
import com.example.eezylife.viewmodel.MainViewModel;
import com.hedyhidoury.calendar.horizontallibrary.HorizontalCalendarView;
import com.mreram.ticketview.TicketView;
import de.hdodenhof.circleimageview.CircleImageView;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout accept;

  @NonNull
  public final LinearLayout acceptBottom;

  @NonNull
  public final LinearLayout accepted;

  @NonNull
  public final LinearLayout acceptedBottom;

  @NonNull
  public final AppCompatTextView authorName;

  @NonNull
  public final LinearLayout clCenter;

  @NonNull
  public final LinearLayout clCenter1;

  @NonNull
  public final LinearLayout clHead;

  @NonNull
  public final LinearLayout clHead1;

  @NonNull
  public final LinearLayout decline;

  @NonNull
  public final LinearLayout declineBottom;

  @NonNull
  public final LinearLayout declined;

  @NonNull
  public final LinearLayout declinedBottom;

  @NonNull
  public final HorizontalCalendarView horizontal;

  @NonNull
  public final CircleImageView photo1;

  @NonNull
  public final CircleImageView photo2;

  @NonNull
  public final CircleImageView photo3;

  @NonNull
  public final LinearLayout root;

  @NonNull
  public final TicketView ticketViewBottom;

  @NonNull
  public final TicketView topTicket;

  @Bindable
  protected MainViewModel mViewModel;

  protected ActivityMainBinding(Object _bindingComponent, View _root, int _localFieldCount,
      LinearLayout accept, LinearLayout acceptBottom, LinearLayout accepted,
      LinearLayout acceptedBottom, AppCompatTextView authorName, LinearLayout clCenter,
      LinearLayout clCenter1, LinearLayout clHead, LinearLayout clHead1, LinearLayout decline,
      LinearLayout declineBottom, LinearLayout declined, LinearLayout declinedBottom,
      HorizontalCalendarView horizontal, CircleImageView photo1, CircleImageView photo2,
      CircleImageView photo3, LinearLayout root, TicketView ticketViewBottom,
      TicketView topTicket) {
    super(_bindingComponent, _root, _localFieldCount);
    this.accept = accept;
    this.acceptBottom = acceptBottom;
    this.accepted = accepted;
    this.acceptedBottom = acceptedBottom;
    this.authorName = authorName;
    this.clCenter = clCenter;
    this.clCenter1 = clCenter1;
    this.clHead = clHead;
    this.clHead1 = clHead1;
    this.decline = decline;
    this.declineBottom = declineBottom;
    this.declined = declined;
    this.declinedBottom = declinedBottom;
    this.horizontal = horizontal;
    this.photo1 = photo1;
    this.photo2 = photo2;
    this.photo3 = photo3;
    this.root = root;
    this.ticketViewBottom = ticketViewBottom;
    this.topTicket = topTicket;
  }

  public abstract void setViewModel(@Nullable MainViewModel viewModel);

  @Nullable
  public MainViewModel getViewModel() {
    return mViewModel;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMainBinding>inflateInternal(inflater, R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMainBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMainBinding)bind(component, view, R.layout.activity_main);
  }
}
