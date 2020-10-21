package com.example.dokyshome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_contacto extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacto);
    }

    <listView
    android:id="@*id/nombreCompleto"
    android:layout_width="match parent
    android:layout_heiht=""

    < android:id="@+id/linearLayout">/listView>
    android:Orientation="Vertical"

    <TextView
    android:id="@*id/tvNombrecompleto"
    android:layout_width="Wrap_Content"
    android:layout_height="Wrap_Content"
    app:layout_constraintBottom_toBottomOf="parent"
    app:layout_constraintTop_toTopOf="parent" />
    android:text="@string/nombre"/>
    android:TextStyle="bold"
    android:TextSize="135dp"

     <TextView
    android:id="@*id/tvemail"
    android:layout_width="Wrap_Content"
    android:layout_height="Wrap_Content" />
    android:text="@string/email"/>


     <TextView
    android:id="@*id/mensaje"
    android:layout_width="Wrap_Content"
    android:layout_height="Wrap_Content" />
    android:text="@string/mensaje"/>
} >
<ImageButton
        android:id="@*id/btnenviarcomentario"
                android:Layout_width="38dp"
                android: Layout_height="38dp"
                android: background="@mipmap/ic_enviarcomentatio"
                >/


