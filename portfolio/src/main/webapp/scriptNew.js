// Copyright 2020 Google LLC
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

async function getFacts() {
  const responseFromServer = await fetch('/funFacts');
  // The json() function returns an object that contains fields that we can
  // reference to create HTML.
  const facts = await responseFromServer.json();
    console.log("bruh");
  const factsListElement = document.getElementById('fun-facts-container');
  const faxx = [facts.fact1, facts.fact2, facts.fact3];
  let bruh = Math.floor(Math.random() * 3);
  factsListElement.innerHTML = faxx[bruh];

  /*factsListElement.appendChild(
      createListElement(facts.fact1));*/
}

/** Creates an <li> element containing text. */
function createListElement(text) {
  const liElement = document.createElement('li');
  liElement.innerText = text;
  return liElement;
}

async function showMessage() {
  const responseFromServer = await fetch('/message');
  const textFromResponse = await responseFromServer.text();

  const textContainer = document.getElementById('text-container');
  textContainer.innerText = textFromResponse;
}