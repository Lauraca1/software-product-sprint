// Copyright 2019 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.sps.servlets;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/** Servlet that responds with the current date. */
@WebServlet("/funFacts")
public final class funFactsJSON extends HttpServlet {
    
    private final ArrayList<String> faxx = new ArrayList<String>(3);

    @Override
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

    // Convert the server stats to JSON
    faxx.add("Laura's favorite disney movie is 'The Emporer's New Groove'");
    faxx.add("Laura's favorite food is sopes");
    faxx.add("Laura is into astrology");
    String json = convertToJson(faxx);

    // Send the JSON as the response
    response.setContentType("application/json;");
    response.getWriter().println(json);
  }

  /**
   * Converts a ServerStats instance into a JSON string using manual String concatentation.
   */
  private String convertToJson(ArrayList<String> facts) {
    String json = "{";
    json += "\"fact1\": ";
    json += "\"" + facts.get(0) + "\"";
    json += ", ";
    json += "\"fact2\": ";
    json += "\"" + facts.get(1) + "\"";
    json += ", ";
    json += "\"fact3\": ";
    json += "\"" + facts.get(2) + "\"";
    json += "}";
    return json;
  }


}
