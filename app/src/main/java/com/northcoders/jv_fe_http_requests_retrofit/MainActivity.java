package com.northcoders.jv_fe_http_requests_retrofit;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.northcoders.jv_fe_http_requests_retrofit.databinding.ActivityMainBinding;
import com.northcoders.jv_fe_http_requests_retrofit.model.Fruit;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;  // Data binding variable
    private ArrayList<Fruit> fruits;
    private FruitAdapter fruitAdapter;
    private MainActivityViewModel viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initialize data binding
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());  // Bind layout to activity

        // Initialize ViewModel
        viewModel = new ViewModelProvider(this).get(MainActivityViewModel.class);

        // Initialize ArrayList
        fruits = new ArrayList<>();

        // Fetch and display data
        getAllFruit();
    }

    private void getAllFruit() {
        viewModel.getAllFruit().observe(this, new Observer<List<Fruit>>() {
            @Override
            public void onChanged(List<Fruit> fruitsFromLiveData) {
                // Update the ArrayList with the new data
                fruits.clear();
                if (fruitsFromLiveData != null) {
                    fruits.addAll(fruitsFromLiveData);
                }
                // Display data in RecyclerView
                displayInRecyclerView();
            }
        });
    }

    private void displayInRecyclerView() {
        // Initialize FruitAdapter
        fruitAdapter = new FruitAdapter(fruits, this);

        // Set RecyclerView adapter
        binding.recyclerView.setAdapter(fruitAdapter);  // Use binding to access RecyclerView

        // Set LayoutManager
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Improve performance
        binding.recyclerView.setHasFixedSize(true);

        // Notify adapter about data changes
        fruitAdapter.notifyDataSetChanged();
    }
}