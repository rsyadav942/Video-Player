package com.rds.videoplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.Vector;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Vector<HLSVideos> hlsVideos = new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(this));

        hlsVideos.add(new HLSVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://player.vimeo.com/external/286837767.m3u8?s=42570e8c4a91b98cdec7e7bfdf0eccf54e700b69\" frameborder=\"0\" allowfullscreen></iframe>") );
        hlsVideos.add(new HLSVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://player.vimeo.com/external/286837810.m3u8?s=610b4fee49a71c2dbf22c01752372ff1c6459b9e\" frameborder=\"0\" allowfullscreen></iframe>") );
        hlsVideos.add(new HLSVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://player.vimeo.com/external/286837723.m3u8?s=3df60d3c1c6c7a11df4047af99c5e05cc2e7ae96\" frameborder=\"0\" allowfullscreen></iframe>") );
        hlsVideos.add(new HLSVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://player.vimeo.com/external/286837649.m3u8?s=9e486e9b932be72a8875afc6eaae21bab124a35a\" frameborder=\"0\" allowfullscreen></iframe>") );
        hlsVideos.add(new HLSVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://player.vimeo.com/external/286837529.m3u8?s=20f83af6ea8fbfc8ce0c2001f32bf037f8b0f65f\" frameborder=\"0\" allowfullscreen></iframe>") );
        hlsVideos.add(new HLSVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://player.vimeo.com/external/286837402.m3u8?s=7e01c398e2f01c29ecbd46e5e2dd53e0d6c1905d\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(hlsVideos);

        recyclerView.setAdapter(videoAdapter);
    }
}
